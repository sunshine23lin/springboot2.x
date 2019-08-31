package com.lwt.springboot.controller;


import org.springframework.web.bind.annotation.*;

import javax.print.attribute.HashDocAttributeSet;
import java.util.HashMap;
import java.util.Map;

@RestController()
public class HelloController {

          @RequestMapping("hello")
          public String hello(){
              return "Hello World";
          }


    /**
     * SpringBoot基础HTTP接口GET请求实战
     */
          @RequestMapping(path="getUser/{id}", method = RequestMethod.GET)
          public Map<String,String> getUser(@PathVariable String id){
              Map<String,String> map = new HashMap<String, String>();
              map.put("id",id);
              map.put("name","james");
              map.put("address","洛杉矶");
              return map;
          }

          // @GetMapping = @RequestMapping(method = RequestMethod.GET)
            @GetMapping(path="getUsers/{id}")
            public Map<String,String> getUsers(@PathVariable String id){
                Map<String,String> map = new HashMap<String, String>();
                map.put("id",id);
                map.put("name","james");
                map.put("address","洛杉矶LA");
                return map;
            }



}
