package com.acs.paymentservice.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.paymentservice.adapters.out.repository.UserRepository;
import com.acs.paymentservice.adapters.out.repository.mapper.UserEntityMapper;
import com.acs.paymentservice.application.core.domain.User;
import com.acs.paymentservice.application.ports.out.FindUserByIdOutputPort;

@Component
public class FindUserByIdAdapter implements FindUserByIdOutputPort {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserEntityMapper userEntityMapper;
	
	@Override
	public Optional<User> find(Integer userId) {
		var userEntity = userRepository.findById(userId);
		
		return userEntity.map(userEntityMapper::toUser);
	}

}
