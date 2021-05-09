package com.lxf.ddd.assembler;

import com.lxf.ddd.dto.UserDTO;
import com.lxf.ddd.domain.user.entity.User;

public class UserAssembler {
    public static UserDTO toDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUserName(user.getUserName());
        return dto;
    }

    public static User toDO(UserDTO dto){
        User user = new User();
        user.setUserId(dto.getUserId());
        user.setUserName(dto.getUserName());
        return user;
    }
}
