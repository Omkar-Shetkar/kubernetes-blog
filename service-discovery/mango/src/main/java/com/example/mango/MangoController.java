package com.example.mango;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MangoController {

    @GetMapping("/juice")
    public String getJuice() {
        return "Serving Mango Juice!";
    }
}
