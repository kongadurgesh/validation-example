package com.javadev.validationexample.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
