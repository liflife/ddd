package com.lxf.ddd.domain.user.repository.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name = "User")
@Data
public class UserPO {
    private String userId;
    private String userName;
    private int age;
    private int source;
    private String address;

}
