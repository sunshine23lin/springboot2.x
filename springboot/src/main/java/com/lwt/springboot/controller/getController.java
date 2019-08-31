package com.lwt.springboot.controller;


import com.lwt.springboot.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *SpringBoot基础HTTP接口GET请求实战
 */
@RestController
public class getController {

     private Map<String,Object> params = new HashMap<>();

    /**
     * 从路径中获取值
     * @param cityID
     * @param userID
     * @return
     */
     @GetMapping(path = "/{city_id}/{user_id}")
     public Object findUser(@PathVariable("city_id") String cityID,
                            @PathVariable("user_id") String userID){
         params.put("cityID",cityID);
         params.put("userID",userID);
         return  params;
     }

    /**
     * http://localhost:8080/v1/page_user?size=100&page=2
     * page为别名赋值给from,当没没带page,默认值0
     * @param from
     * @param size
     * @return
     */
     @GetMapping(value = "/v1/page_user")
     public Object pageUser(@RequestParam(defaultValue = "0",name="page") int  from, int size){
         params.clear();
         params.put("from",from);
         params.put("size",size);
         return params;
     }


    /**
     * 功能描述：bean对象传参
     * 	 * 注意：1、注意需要指定http头为 content-type为application/json
     * 	 * 		2、使用body传输数据
     * @param user
     * @return
     */
    @RequestMapping("v1/save_user")
     public Object saveUser(@RequestBody User user){
         params.clear();
         params.put("user",user);
         return params;
     }

     @GetMapping("/v1/get_header")
     public Object getHeader(@RequestHeader("access_token") String accessToken,String id){
        params.clear();
        params.put("access_token",accessToken);
        params.put("id",id);
        return params;
     }

}
