package com.acs.paymentservice.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.acs.paymentservice.adapters.out.repository.entity.PaymentEntity;
import com.acs.paymentservice.application.core.domain.Payment;

@Mapper(componentModel = "spring")
public interface PaymentEntityMapper {

	PaymentEntity toPayment(Payment payment);
	
}
