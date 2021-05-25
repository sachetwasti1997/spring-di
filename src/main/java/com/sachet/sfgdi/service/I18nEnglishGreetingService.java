package com.sachet.sfgdi.service;

import com.sachet.sfgdi.repository.EnglishGreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreetings() {
        return englishGreetingRepository.getGreeting();
    }
}
