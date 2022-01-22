package com.example.frontdesk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontdeskController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/apple")
    public String getAppleJuice() {
        String response = restTemplate.getForObject("http://apple-service:8081/juice", String.class);
        return response;
    }
}
