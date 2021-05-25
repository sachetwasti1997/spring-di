package com.sachet.sfgdi.controller;

import com.sachet.sfgdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println(greetingService.sayGreetings());

        return greetingService.sayGreetings();
    }

}
