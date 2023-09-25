package com.acs.paymentservice.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.paymentservice.adapters.out.FindUserByIdAdapter;
import com.acs.paymentservice.application.core.usecase.FindUserByIdUseCase;

@Configuration
public class FindUserByIdConfig {

    @Bean
    FindUserByIdUseCase findUserByIdUseCase(
             FindUserByIdAdapter findUserByIdAdapter) {
		return new FindUserByIdUseCase(findUserByIdAdapter);
	}
	
}
