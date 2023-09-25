package com.acs.sale.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.sale.adapters.out.SaveSaleAdapter;
import com.acs.sale.adapters.out.SendCreatedSaleAdapter;
import com.acs.sale.application.core.usecase.CreateSaleUseCase;

@Configuration
public class CreateSaleConfig {

	@Bean
	public CreateSaleUseCase createSaleUseCase(
			SaveSaleAdapter saveSaleAdapter,
			SendCreatedSaleAdapter sendCreatedSaleAdapter
	) {
		return new CreateSaleUseCase(saveSaleAdapter, sendCreatedSaleAdapter);
	}
	
}
