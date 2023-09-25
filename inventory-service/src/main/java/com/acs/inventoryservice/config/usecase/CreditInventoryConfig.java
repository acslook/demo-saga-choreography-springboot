package com.acs.inventoryservice.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.inventoryservice.adapters.out.SendToKafkaAdapter;
import com.acs.inventoryservice.adapters.out.UpdateInventoryAdapter;
import com.acs.inventoryservice.application.core.usecase.CreditInventoryUseCase;
import com.acs.inventoryservice.application.core.usecase.FindInventoryByProductIdUseCase;

@Configuration
public class CreditInventoryConfig {

	@Bean
	public CreditInventoryUseCase creditInventoryUseCase(
			FindInventoryByProductIdUseCase findInventoryByProductIdUseCase,
			UpdateInventoryAdapter updateInventoryAdapter,
			SendToKafkaAdapter sendToKafkaAdapter) {
		return new CreditInventoryUseCase(findInventoryByProductIdUseCase, updateInventoryAdapter, sendToKafkaAdapter);
	}
	
}
