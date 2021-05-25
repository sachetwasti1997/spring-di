package com.sachet.sfgdi.service;

public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello from Primary bean!!!";
    }
}
