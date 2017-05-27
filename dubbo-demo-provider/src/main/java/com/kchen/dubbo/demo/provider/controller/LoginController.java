package com.kchen.dubbo.demo.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "home";
    }
}
