package com.acs.inventoryservice.application.ports.in;

import com.acs.inventoryservice.application.core.domain.Inventory;

public interface FindInventoryByProductIdInputPort {
	
	Inventory find(Integer productId);
}
