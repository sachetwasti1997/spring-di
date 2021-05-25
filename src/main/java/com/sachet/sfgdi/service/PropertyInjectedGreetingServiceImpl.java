package com.sachet.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Property!";
    }
}
