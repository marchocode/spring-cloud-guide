package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
@Slf4j
public class NotificationController {

    @GetMapping("/hello")
    public String hello() {
        log.info("receive message..");
        return "notification hello.";
    }

}
