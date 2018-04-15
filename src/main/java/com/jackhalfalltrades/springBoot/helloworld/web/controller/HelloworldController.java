package com.jackhalfalltrades.springBoot.helloworld.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloworldController.class);

    @GetMapping(value="/helloWorld/{name}")
    public @ResponseBody String getHelloworld(@PathVariable String name) {
        return "Hello World by " + name;
    }
}
