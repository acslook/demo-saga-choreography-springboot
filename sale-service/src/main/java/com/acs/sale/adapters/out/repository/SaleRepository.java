package com.acs.sale.adapters.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acs.sale.adapters.out.repository.entity.SaleEntity;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Integer> {
	
}
