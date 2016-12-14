package com.yifei;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2016/12/13.
 */
@Controller
@RequestMapping("/hello")
public class IndexController {
    @RequestMapping("")
    public String index() {
        return "hello";
    }
    @RequestMapping("/contact")
    public String contact() {
        return "contact-us";
    }
}
