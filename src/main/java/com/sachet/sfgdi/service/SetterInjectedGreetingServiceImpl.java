package com.sachet.sfgdi.service;

public class SetterInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Setter";
    }
}
