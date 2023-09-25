package com.acs.paymentservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.acs.paymentservice.adapters.out.message.SaleMessage;
import com.acs.paymentservice.application.core.domain.Sale;
import com.acs.paymentservice.application.core.domain.enums.SaleEvent;
import com.acs.paymentservice.application.ports.out.SendToKafkaOutputPort;

@Component
public class SendToKafkaAdapter implements SendToKafkaOutputPort {

	@Autowired 
	private KafkaTemplate<String, SaleMessage> kafkaTemplate;
	
	@Override
	public void send(Sale sale, SaleEvent event) {
		var saleMessage = new SaleMessage(sale, event);
		
		kafkaTemplate.send("tp-saga-sale", saleMessage);
	}

}
