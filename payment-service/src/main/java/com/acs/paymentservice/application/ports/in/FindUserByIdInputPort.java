package com.acs.paymentservice.application.ports.in;

import com.acs.paymentservice.application.core.domain.User;

public interface FindUserByIdInputPort {
	
	User find(final Integer id);
	
}
