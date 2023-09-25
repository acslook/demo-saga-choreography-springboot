package com.acs.inventoryservice.application.core.domain;

import lombok.Data;

@Data
public class Inventory {

	public Inventory() {
		
	}
	
	public Inventory(Integer id, Integer productId, Integer quantity) {		
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
	}

	private Integer id;
	
	private Integer productId;
	
	private Integer quantity;
	
	public Integer getId() {
		return id;
	}

	public void debitQuantity(Integer quantity) {
		this.quantity -= quantity;
	}
	
	public void creditQuantity(Integer quantity) {
		this.quantity += quantity;
	}
}
