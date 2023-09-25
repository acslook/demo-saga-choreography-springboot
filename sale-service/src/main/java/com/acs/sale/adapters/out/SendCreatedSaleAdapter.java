package com.acs.sale.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.acs.sale.adapters.out.message.SaleMessage;
import com.acs.sale.application.core.domain.Sale;
import com.acs.sale.application.core.domain.enums.SaleEvent;
import com.acs.sale.application.ports.out.SendCreatedSaleOutputPort;

@Component
public class SendCreatedSaleAdapter implements SendCreatedSaleOutputPort {

	@Autowired
	private KafkaTemplate<String, SaleMessage> kafkaTemplate;
	
	@Override
	public void send(Sale sale, SaleEvent event) {
		var saleMessage = new SaleMessage(sale, event);
		kafkaTemplate.send("tp-saga-sale", saleMessage);
	}

}
