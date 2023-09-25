package com.acs.inventoryservice.application.ports.in;

import com.acs.inventoryservice.application.core.domain.Sale;

public interface CreditInventoryInputPort {

	void credit(Sale sale);
	
}
