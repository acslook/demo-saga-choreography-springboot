package com.acs.paymentservice.application.ports.out;

import com.acs.paymentservice.application.core.domain.Sale;
import com.acs.paymentservice.application.core.domain.enums.SaleEvent;

public interface SendToKafkaOutputPort {

	void send(Sale sale, SaleEvent event);
	
}
