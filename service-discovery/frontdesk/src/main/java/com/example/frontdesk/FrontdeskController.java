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
    public String welcome() {
        return "Welcome to K8S Juice Center!";
    }

    @GetMapping("/apple")
    public String getAppleJuice() {
        String response = restTemplate.getForObject("http://apple-service/juice", String.class);
        return response;
    }

    @GetMapping("/mango")
    public String getMangoJuice() {
        String response = restTemplate.getForObject("http://mango-service/juice", String.class);
        return response;
    }
}
