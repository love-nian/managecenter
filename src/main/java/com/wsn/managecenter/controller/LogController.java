package com.wsn.managecenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Lenovo
 * @Date: 2018/3/28
 * @Time: 21:25
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class LogController {

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }
}
