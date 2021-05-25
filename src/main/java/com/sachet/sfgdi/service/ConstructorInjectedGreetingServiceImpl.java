package com.sachet.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Constructor";
    }
}
