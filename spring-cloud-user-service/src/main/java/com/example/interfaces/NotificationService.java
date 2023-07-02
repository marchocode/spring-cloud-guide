package com.example.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("notification-service")
public interface NotificationService {

    @GetMapping("/notification/hello")
    String hello();

}
