package com.lxf.ddd.service;

import com.lxf.ddd.domain.user.entity.User;
import com.lxf.ddd.domain.user.service.UserDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserApplicationService {
    @Autowired
    UserDomainService userDomainService;

    @Transactional
    public void createUser(User user) {
       return userDomainService.createUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDomainService.updateUser(user);
    }
}
