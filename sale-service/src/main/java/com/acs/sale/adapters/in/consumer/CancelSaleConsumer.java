package com.acs.sale.adapters.in.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.acs.sale.adapters.out.message.SaleMessage;
import com.acs.sale.application.core.domain.enums.SaleEvent;
import com.acs.sale.application.ports.in.CancelSaleInputPort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CancelSaleConsumer {

	@Autowired
	private CancelSaleInputPort cancelSaleInputPort;
	
	@KafkaListener(topics = "tp-saga-sale", groupId = "sale-cancel")
	public void receive(SaleMessage saleMessage) {
		if(SaleEvent.ROLLBACK_INVETORY.equals(saleMessage.getEvent())) {
			log.info("Cancelando a venda...");
			
			cancelSaleInputPort.cancel(saleMessage.getSale());
			
			log.info("Venda cancelada com sucesso.");
		}
	}
	
}
