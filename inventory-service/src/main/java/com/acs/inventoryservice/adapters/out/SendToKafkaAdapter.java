package com.acs.inventoryservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.acs.inventoryservice.adapters.out.message.SaleMessage;
import com.acs.inventoryservice.application.core.domain.Sale;
import com.acs.inventoryservice.application.core.domain.enums.SaleEvent;
import com.acs.inventoryservice.application.ports.out.SendToKafkaOutputPort;

@Component
public class SendToKafkaAdapter implements SendToKafkaOutputPort {

	@Autowired
	private KafkaTemplate<String, SaleMessage> kafkaTemplate;
	
	@Override
	public void send(Sale sale, SaleEvent saleEvent) {
		var saleMessage = new SaleMessage(sale, saleEvent);
		
		kafkaTemplate.send("tp-saga-sale", saleMessage);
	}

}
