package com.yifei;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2016/12/13.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("")
    public String index() {
        return "index";
    }
    @RequestMapping("/contact")
    public String contact() {
        return "contact-us";
    }
    @RequestMapping("/about")
    public String about() {
        return "about-us";
    }
}
