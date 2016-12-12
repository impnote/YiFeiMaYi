package com.yifei;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2016/12/9.
 */
@RestController
@RequestMapping(path = "/test")
public class HelloWorldController {

    @RequestMapping(path = "/demo",method = RequestMethod.GET)
    public String sayHello() {
         String a = "hello";
        return a;
    }
}
