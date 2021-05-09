package com.lxf.ddd.domain.user.service;

import com.alibaba.fastjson.JSON;
import com.lxf.ddd.infrastructure.po.EventPO;
import com.lxf.ddd.domain.user.event.UserEvent;
import com.lxf.ddd.domain.user.entity.User;
import com.lxf.ddd.domain.user.repository.po.UserPO;
import org.springframework.stereotype.Service;

@Service
public class UserFactory {

    public UserPO createPO(User user) {
        UserPO userPO = new UserPO();
        userPO.setUserId(user.getUserId());
        userPO.setUserName(user.getUserName());
        return userPO;
    }

    public User get(UserPO userPO) {
        User user = new User();
        user.setUserId(userPO.getUserId());
        user.setUserName(userPO.getUserName());
        return user;
    }

    public EventPO createUserEventPO(UserEvent event) {
        EventPO eventPO = new EventPO();
        eventPO.setEventId(event.getId());
        eventPO.setSource(event.getSource());
        eventPO.setTimestamp(event.getTimestamp());
        eventPO.setData(JSON.toJSONString(event.getData()));
        return eventPO;
    }
}
