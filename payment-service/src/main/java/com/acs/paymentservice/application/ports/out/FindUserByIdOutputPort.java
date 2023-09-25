package com.acs.paymentservice.application.ports.out;

import java.util.Optional;

import com.acs.paymentservice.application.core.domain.User;

public interface FindUserByIdOutputPort {

	Optional<User> find(Integer userId);
	
}
