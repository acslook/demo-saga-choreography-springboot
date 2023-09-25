package com.acs.paymentservice.application.core.usecase;

import com.acs.paymentservice.application.core.domain.User;
import com.acs.paymentservice.application.ports.in.FindUserByIdInputPort;
import com.acs.paymentservice.application.ports.out.FindUserByIdOutputPort;

public class FindUserByIdUseCase implements FindUserByIdInputPort {

	private final FindUserByIdOutputPort findUserByIdOutputPort;
	
	public FindUserByIdUseCase(FindUserByIdOutputPort findUserByIdOutputPort) {
		this.findUserByIdOutputPort = findUserByIdOutputPort;
	}
	
	@Override
	public User find(final Integer id) {
		return findUserByIdOutputPort.find(id)
				.orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
	}
	
}
