package com.ariel.ApiHexagonalExample.Infrastructure.config.spring;

import com.ariel.ApiHexagonalExample.Application.repository.UsersRepository;
import com.ariel.ApiHexagonalExample.Application.service.UsersServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootServiceConfig {

    @Bean
    public UsersServices userService(UsersRepository ur){
        return new UsersServices(ur);
    }
}
