package com.acs.paymentservice.application.ports.out;

import com.acs.paymentservice.application.core.domain.Payment;

public interface SavePaymentOutputPort {
	
	void save(Payment payment);
	
}
