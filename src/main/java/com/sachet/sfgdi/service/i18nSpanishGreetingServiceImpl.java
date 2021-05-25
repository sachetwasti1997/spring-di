package com.sachet.sfgdi.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class i18nSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hula Munda - ES";
    }
}
