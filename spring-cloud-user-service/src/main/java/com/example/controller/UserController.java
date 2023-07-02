package com.example.controller;

import com.example.interfaces.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

    @Value("${user.value}")
    private String value;

    private final NotificationService notificationService;

    @GetMapping("/")
    public ResponseEntity<String> list() {

        log.info("get new request.");

        log.info("request notification service");
        String message = notificationService.hello();

        log.info("response message ={}", message);

        return ResponseEntity.ok(value);
    }

}
