package com.lxf.ddd.domain.user.service;

import com.lxf.ddd.infrastructure.event.InEventPublisher;
import com.lxf.ddd.infrastructure.mapper.EventMapper;
import com.lxf.ddd.domain.user.entity.User;
import com.lxf.ddd.domain.user.event.UserEvent;
import com.lxf.ddd.domain.user.event.UserEventType;
import com.lxf.ddd.domain.user.repository.mapper.UserMapper;
import com.lxf.ddd.domain.user.repository.po.UserPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserDomainService {

    @Autowired
    InEventPublisher inEventPublisher;
    @Autowired
    UserMapper userMapper;
    @Autowired
    EventMapper eventMapper;
    @Autowired
    UserFactory userFactory;

    @Transactional
    public void createUser(User user) {
        user.create();
        userMapper.insert(userFactory.createPO(user));
        UserEvent event = UserEvent.create(UserEventType.CREATE_EVENT, user);
        eventMapper.insert(userFactory.createUserEventPO(event));
        inEventPublisher.publish(event);
    }

    @Transactional
    public void updateUser(User user) {
        UserPO po = userMapper.selectByPrimaryKey(user.getUserId());
        if (null == po) {
            throw new RuntimeException("user does not exist");
        }
        userMapper.updateByPrimaryKey(po);
    }
    public void queryUser(User user) {
        UserPO po = userMapper.selectByPrimaryKey(user.getUserId());
        if (null == po) {
            throw new RuntimeException("user does not exist");
        }
        UserPO userPO = userMapper.selectByPrimaryKey(user.getUserId());

    }
}