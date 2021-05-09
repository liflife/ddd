package com.lxf.ddd.domain.user.entity;

import lombok.Data;


@Data
public class User {
    private String userId;
    private String userName;
    private int age;
    private int source;
    private String address;

    public User create(){
        return this;
    }
}
