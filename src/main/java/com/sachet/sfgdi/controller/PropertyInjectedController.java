package com.sachet.sfgdi.controller;

import com.sachet.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayGreeting(){
        return greetingService.sayGreetings();
    }

}
