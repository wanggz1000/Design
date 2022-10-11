package com.example.design;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignController {

    Design a = new Design();

    @RequestMapping("/green")
    public String Green(String red){
        return a.Green(red);
    }

    @RequestMapping("/red")
    public String Red(String green){
        return a.Red(green);
    }
}
