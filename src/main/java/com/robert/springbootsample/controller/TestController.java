package com.robert.springbootsample.controller;

import com.robert.springbootsample.model.ResponseData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hello "+myName+"!!!";
    }

    @RequestMapping(value = "/h/{msg}",produces = "application/json;charset=UTF-8")
    @ResponseBody
    Object rspJson(){
        ResponseData responseData=new ResponseData();
        return responseData;
    }
}
