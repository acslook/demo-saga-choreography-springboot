package com.acs.inventoryservice.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.acs.inventoryservice.adapters.out.repository.entity.InventoryEntity;
import com.acs.inventoryservice.application.core.domain.Inventory;

@Mapper(componentModel = "spring")
public interface InventoryEntityMapper {

	Inventory toInventory(InventoryEntity inventoryEntity);
	
	InventoryEntity toInventoryEntity(Inventory inventory);
}
