package com.sachet.sfgdi.service;

public class PropertyInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Property!";
    }
}
