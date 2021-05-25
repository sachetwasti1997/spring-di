package com.sachet.sfgdi.service;

public class ConstructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Constructor";
    }
}
