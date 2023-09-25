package com.acs.inventoryservice.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.inventoryservice.adapters.out.repository.InventoryRepository;
import com.acs.inventoryservice.adapters.out.repository.mapper.InventoryEntityMapper;
import com.acs.inventoryservice.application.core.domain.Inventory;
import com.acs.inventoryservice.application.ports.out.FindInventoryByProductIdOutputPort;

@Component
public class FindInventoryByProductIdAdapter implements FindInventoryByProductIdOutputPort {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Autowired 
	InventoryEntityMapper inventoryEntityMapper;
	
	@Override
	public Optional<Inventory> find(Integer productId) {
		 var inventoryEntity = inventoryRepository.findByProductId(productId);
		 
		 // return inventoryEntity.map(entity -> inventoryEntityMapper.toInventory(entity));
		 return inventoryEntity.map(inventoryEntityMapper::toInventory);
	}

}
