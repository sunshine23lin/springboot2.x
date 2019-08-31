package com.lwt.springboot.controller;


import com.lwt.springboot.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SamleController {

    @GetMapping("/testjson")
    public Object testjson() {
        return new User(1, "james", "23","james","122345",new Date());
    }
}
