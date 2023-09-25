package com.acs.paymentservice.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.acs.paymentservice.adapters.out.repository.entity.UserEntity;
import com.acs.paymentservice.application.core.domain.User;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

	User toUser(UserEntity userEntity);
	
	UserEntity toUserEntity(User user);
	
}
