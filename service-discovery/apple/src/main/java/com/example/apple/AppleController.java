package com.example.apple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppleController {

    private final String EMOJI = "\uD83C\uDF79";

    @GetMapping("/juice")
    public String getJuice() {
        return "Serving Apple Juice!" + EMOJI;
    }
}
