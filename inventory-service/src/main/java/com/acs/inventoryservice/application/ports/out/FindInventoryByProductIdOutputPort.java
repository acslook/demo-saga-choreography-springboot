package com.acs.inventoryservice.application.ports.out;

import java.util.Optional;

import com.acs.inventoryservice.application.core.domain.Inventory;

public interface FindInventoryByProductIdOutputPort {
	
	Optional<Inventory> find(final Integer productId);
	
}
