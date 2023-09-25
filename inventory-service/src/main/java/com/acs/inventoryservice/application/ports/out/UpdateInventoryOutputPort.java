package com.acs.inventoryservice.application.ports.out;

import com.acs.inventoryservice.application.core.domain.Inventory;

public interface UpdateInventoryOutputPort {

	void update(Inventory inventory);
	
}
