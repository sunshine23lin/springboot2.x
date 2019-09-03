package com.lwt.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试http协议的post,del,put请求
 */
@RestController
public class OtherHttpController {

    private Map<String,Object> params = new HashMap<>();


    /**
     * 功能测试
     * @param id
     * @param pwd
     * @return
     */
    @PostMapping("v1//login")
    public Object login(String id,String pwd){
        params.clear();
        params.put("id",id);
        params.put("pwd",pwd);
        params.put("a","aa");
        return params;
    }

    @PostMapping("/v1/put")
    public Object put(String id){
        params.clear();
        params.put("id",id);
        return params;
    }

    public Object del(String id){
        params.clear();
        params.put("id",id);
        return params;
    }
}
