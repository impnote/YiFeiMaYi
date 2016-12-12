package com.yifei;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2016/12/13.
 */
@RequestMapping("/")
public class IndexController {
    public String index() {
        return "index";
    }
}
