package com.acs.paymentservice.adapters.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acs.paymentservice.adapters.out.repository.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
}
