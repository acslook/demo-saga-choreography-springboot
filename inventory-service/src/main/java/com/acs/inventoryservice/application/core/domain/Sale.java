package com.acs.inventoryservice.application.core.domain;

import java.math.BigDecimal;

import com.acs.inventoryservice.application.core.domain.enums.SaleStatus;

import lombok.Data;

@Data
public class Sale {
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}	

	public Sale(Integer id, Integer productId, Integer userId, BigDecimal value, SaleStatus status, Integer quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.userId = userId;
		this.value = value;
		this.status = status;
		this.quantity = quantity;
	}



	private Integer id;
	
	private Integer productId;
	
	private Integer userId;
	
	private BigDecimal value;
	
	private SaleStatus status;
	
	private Integer quantity;
	
}
