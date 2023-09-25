package com.acs.inventoryservice.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.inventoryservice.adapters.out.FindInventoryByProductIdAdapter;
import com.acs.inventoryservice.application.core.usecase.FindInventoryByProductIdUseCase;

@Configuration
public class FindInventoryByProductIdConfig {

	@Bean
	public FindInventoryByProductIdUseCase findInventoryByProductIdUseCase(
			FindInventoryByProductIdAdapter findInventoryByProductIdAdapter) {
		return new FindInventoryByProductIdUseCase(findInventoryByProductIdAdapter);
	}
	
}
