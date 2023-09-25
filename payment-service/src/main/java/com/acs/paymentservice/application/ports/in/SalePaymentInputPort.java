package com.acs.paymentservice.application.ports.in;

import com.acs.paymentservice.application.core.domain.Sale;

public interface SalePaymentInputPort {

	void payment(Sale sale);
	
}
