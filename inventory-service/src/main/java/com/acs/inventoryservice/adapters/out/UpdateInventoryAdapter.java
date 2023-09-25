package com.acs.inventoryservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.inventoryservice.adapters.out.repository.InventoryRepository;
import com.acs.inventoryservice.adapters.out.repository.mapper.InventoryEntityMapper;
import com.acs.inventoryservice.application.core.domain.Inventory;
import com.acs.inventoryservice.application.ports.out.UpdateInventoryOutputPort;

@Component
public class UpdateInventoryAdapter implements UpdateInventoryOutputPort {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired
	private InventoryEntityMapper inventoryEntityMapper;
	
	@Override
	public void update(Inventory inventory) {
		var inventoryEntity = inventoryEntityMapper.toInventoryEntity(inventory);
		
		inventoryRepository.save(inventoryEntity);
	}

}
