package com.acs.sale.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.sale.adapters.out.SaveSaleAdapter;
import com.acs.sale.application.core.usecase.FinalizeSaleUseCase;
import com.acs.sale.application.core.usecase.FindSaleByIdUseCase;

@Configuration
public class FinalizeSaleConfig {

	@Bean
	public FinalizeSaleUseCase finalizeSaleUseCase(
			FindSaleByIdUseCase findSaleByIdUseCase,
			SaveSaleAdapter saveSaleAdapter) {
		return new FinalizeSaleUseCase(findSaleByIdUseCase, saveSaleAdapter);
	}
	
}
