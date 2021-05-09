package com.lxf.ddd.web;

import com.lxf.ddd.assembler.UserAssembler;
import com.lxf.ddd.dto.UserDTO;
import com.lxf.ddd.infrastructure.api.Result;
import com.lxf.ddd.infrastructure.apo.ResultHandler;
import com.lxf.ddd.service.UserApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserApplicationService userApplicationService;

    @PostMapping("/create")
    @ResultHandler
    public Result create(UserDTO personDTO) {
        userApplicationService.createUser(UserAssembler.toDO(personDTO));
        return Result.ok("OK");
    }
    @RequestMapping("/query")
    @ResultHandler
    public Result query(UserDTO personDTO) {
        userApplicationService.createUser(UserAssembler.toDO(personDTO));
        return Result.ok("OK");
    }
}
