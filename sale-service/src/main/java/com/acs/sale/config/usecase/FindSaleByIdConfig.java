package com.acs.sale.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.sale.adapters.out.FindSaleByIdAdapter;
import com.acs.sale.application.core.usecase.FindSaleByIdUseCase;

@Configuration
public class FindSaleByIdConfig {

	@Bean
	public FindSaleByIdUseCase findSaleByIdUseCase(
			FindSaleByIdAdapter findSaleByIdAdapter) {
		return new FindSaleByIdUseCase(findSaleByIdAdapter);
	}
	
}
