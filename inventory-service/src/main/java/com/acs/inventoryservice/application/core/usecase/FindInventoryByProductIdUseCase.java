package com.acs.inventoryservice.application.core.usecase;

import com.acs.inventoryservice.application.core.domain.Inventory;
import com.acs.inventoryservice.application.ports.in.FindInventoryByProductIdInputPort;
import com.acs.inventoryservice.application.ports.out.FindInventoryByProductIdOutputPort;

public class FindInventoryByProductIdUseCase implements FindInventoryByProductIdInputPort {

	private FindInventoryByProductIdOutputPort findInventoryByProductIdOutputPort;
	
	public FindInventoryByProductIdUseCase(
			FindInventoryByProductIdOutputPort findInventoryByProductIdOutputPort) {
		this.findInventoryByProductIdOutputPort = findInventoryByProductIdOutputPort;
	}
	
	public Inventory find(Integer productId) {
		return findInventoryByProductIdOutputPort.find(productId)
				.orElseThrow(() -> new RuntimeException("Estoque não encontrado para este produto!"));
	}
	
}
