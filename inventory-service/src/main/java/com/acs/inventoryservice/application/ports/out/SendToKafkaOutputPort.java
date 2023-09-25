package com.acs.inventoryservice.application.ports.out;

import com.acs.inventoryservice.application.core.domain.Sale;
import com.acs.inventoryservice.application.core.domain.enums.SaleEvent;

public interface SendToKafkaOutputPort {
	
	void send(Sale sale, SaleEvent saleEvent);
	
}
