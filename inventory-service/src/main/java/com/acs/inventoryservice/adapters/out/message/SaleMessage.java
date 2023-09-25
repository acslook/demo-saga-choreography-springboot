package com.acs.inventoryservice.adapters.out.message;

import com.acs.inventoryservice.application.core.domain.Sale;
import com.acs.inventoryservice.application.core.domain.enums.SaleEvent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleMessage {
	
	private Sale sale;
	
	private SaleEvent event;
	
}
