package com.lwt.springboot.controller;


import com.lwt.springboot.domain.Can;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CanController {

    @Autowired
    private Can can;

    @GetMapping("/getCan")
     public Can getCan(){
         return  can;
     }

}
