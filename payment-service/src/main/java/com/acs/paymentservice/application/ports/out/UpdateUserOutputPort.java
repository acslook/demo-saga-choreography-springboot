package com.acs.paymentservice.application.ports.out;

import com.acs.paymentservice.application.core.domain.User;

public interface UpdateUserOutputPort {

	void update(User user);
	
}
