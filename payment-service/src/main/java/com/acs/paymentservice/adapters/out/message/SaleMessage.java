package com.acs.paymentservice.adapters.out.message;

import com.acs.paymentservice.application.core.domain.Sale;
import com.acs.paymentservice.application.core.domain.enums.SaleEvent;

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
