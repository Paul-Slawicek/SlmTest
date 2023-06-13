package com.example.slmtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
 int usages = 0;
    @RequestMapping
    public int sum(@RequestParam int a, @RequestParam int b, @RequestParam int c, @RequestParam int d){
        usages++;
        return a+b+c+d;
    }
}
