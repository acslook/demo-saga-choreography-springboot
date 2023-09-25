package com.acs.paymentservice.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.paymentservice.adapters.out.SavePaymentAdapter;
import com.acs.paymentservice.adapters.out.SendToKafkaAdapter;
import com.acs.paymentservice.adapters.out.UpdateUserAdapter;
import com.acs.paymentservice.application.core.usecase.FindUserByIdUseCase;
import com.acs.paymentservice.application.core.usecase.SalePaymentUseCase;

@Configuration
public class SalePaymentConfig {

	@Bean
	SalePaymentUseCase salePaymentUseCase(
			FindUserByIdUseCase findUserByIdUseCase,
			UpdateUserAdapter updateUserAdapter,
			SavePaymentAdapter saPaymentAdapter,
			SendToKafkaAdapter sendValidatedPaymentAdapter) {
		return new SalePaymentUseCase(findUserByIdUseCase, updateUserAdapter, saPaymentAdapter, sendValidatedPaymentAdapter);
	}
	
}
