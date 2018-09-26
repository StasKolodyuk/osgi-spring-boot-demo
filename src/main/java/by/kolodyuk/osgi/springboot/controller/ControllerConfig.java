package by.kolodyuk.osgi.springboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    SimpleController simpleController() {
        return new SimpleController();
    }

}
