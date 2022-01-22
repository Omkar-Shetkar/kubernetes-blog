package com.example.mango;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MangoController {

    private final String EMOJI = "\uD83C\uDF79";

    @GetMapping("/juice")
    public String getJuice() {
        return "Serving Mango Juice!" + EMOJI + " " + EMOJI;
    }
}
