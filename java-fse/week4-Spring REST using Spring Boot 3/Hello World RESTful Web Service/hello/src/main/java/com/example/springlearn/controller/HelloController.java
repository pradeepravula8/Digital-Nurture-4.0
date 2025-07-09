package com.example.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        LOGGER.debug("START of sayHello()");
        String message = "Hello World!!";
        LOGGER.debug("END of sayHello()");
        return message;
    }
}
