package com.drms.disaster_relief.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

    @RestController
    public class TestController {

        @GetMapping("/api/test")
        public Map<String, String> sayHello() {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Hello Frontend! The Muhafiz Backend is fully operational!");
            response.put("status", "SUCCESS");
            return response;
        }
}
