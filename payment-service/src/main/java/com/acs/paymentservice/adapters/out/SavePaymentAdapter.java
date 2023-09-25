package com.acs.paymentservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.paymentservice.adapters.out.repository.PaymentRepository;
import com.acs.paymentservice.adapters.out.repository.mapper.PaymentEntityMapper;
import com.acs.paymentservice.application.core.domain.Payment;
import com.acs.paymentservice.application.ports.out.SavePaymentOutputPort;

@Component
public class SavePaymentAdapter implements SavePaymentOutputPort {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private PaymentEntityMapper paymentEntityMapper;
	
	@Override
	public void save(Payment payment) {
		var paymentEntity = paymentEntityMapper.toPayment(payment);
		
		paymentRepository.save(paymentEntity);
	}

}
