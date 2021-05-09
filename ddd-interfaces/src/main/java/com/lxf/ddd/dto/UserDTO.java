package com.lxf.ddd.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String userId;
    private String userName;
    private int age;
    private int source;
    private String address;
}
