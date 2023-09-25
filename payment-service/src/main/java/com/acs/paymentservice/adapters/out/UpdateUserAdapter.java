package com.acs.paymentservice.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.paymentservice.adapters.out.repository.UserRepository;
import com.acs.paymentservice.adapters.out.repository.mapper.UserEntityMapper;
import com.acs.paymentservice.application.core.domain.User;
import com.acs.paymentservice.application.ports.out.UpdateUserOutputPort;

@Component
public class UpdateUserAdapter implements UpdateUserOutputPort{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserEntityMapper userEntityMapper;
	
	@Override
	public void update(User user) {
		var userEntity = userEntityMapper.toUserEntity(user);
		userRepository.save(userEntity);
	}

}
