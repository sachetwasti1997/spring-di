package com.sachet.sfgdi.config;

import com.sachet.sfgdi.repository.EnglishGreetingRepository;
import com.sachet.sfgdi.repository.EnglishGreetingRepositoryImpl;
import com.sachet.sfgdi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfiguration {

    @Profile({"ES", "default"})
    @Bean("i18Service")
    I18nSpanishGreetingServiceImpl i18nSpanishGreetingService(){
        return new I18nSpanishGreetingServiceImpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18Service(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingServiceImpl  primaryGreetingService(){
        return new PrimaryGreetingServiceImpl();
    }

    @Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingServiceImpl();
    }

    @Bean
    SetterInjectedGreetingServiceImpl setterInjectedGreetingService(){
        return new SetterInjectedGreetingServiceImpl();
    }

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingServiceImpl();
    }

}
