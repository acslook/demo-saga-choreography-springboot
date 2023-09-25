package com.acs.sale.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.sale.adapters.out.SaveSaleAdapter;
import com.acs.sale.application.core.usecase.CancelSaleUseCase;
import com.acs.sale.application.core.usecase.FindSaleByIdUseCase;

@Configuration
public class CancelSaleConfig {

	@Bean
	CancelSaleUseCase cancelSaleUseCase(
			FindSaleByIdUseCase findSaleByIdUseCase,
			SaveSaleAdapter saveSaleAdapter) {
		return new CancelSaleUseCase(findSaleByIdUseCase, saveSaleAdapter);
	}
	
}
