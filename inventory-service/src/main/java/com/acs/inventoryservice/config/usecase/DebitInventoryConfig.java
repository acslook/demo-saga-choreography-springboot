package com.acs.inventoryservice.config.usecase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acs.inventoryservice.adapters.out.SendToKafkaAdapter;
import com.acs.inventoryservice.adapters.out.UpdateInventoryAdapter;
import com.acs.inventoryservice.application.core.usecase.DebitInventoryUseCase;
import com.acs.inventoryservice.application.core.usecase.FindInventoryByProductIdUseCase;
import com.acs.inventoryservice.application.ports.out.SendToKafkaOutputPort;

@Configuration
public class DebitInventoryConfig {

	@Bean
	public DebitInventoryUseCase debitInventoryUseCase(
			FindInventoryByProductIdUseCase findInventoryByProductIdUseCase,
			UpdateInventoryAdapter updateInventoryAdapter,
			SendToKafkaOutputPort sendToKafkaOutputPort) {
		return new DebitInventoryUseCase(findInventoryByProductIdUseCase, updateInventoryAdapter, sendToKafkaOutputPort);
	}
	
}
