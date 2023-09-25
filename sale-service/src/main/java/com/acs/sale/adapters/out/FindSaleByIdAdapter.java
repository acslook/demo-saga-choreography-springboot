package com.acs.sale.adapters.out;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.sale.adapters.out.repository.SaleRepository;
import com.acs.sale.adapters.out.repository.mapper.SaleEntityMapper;
import com.acs.sale.application.core.domain.Sale;
import com.acs.sale.application.ports.out.FindSaleByIdOutputPort;

@Component
public class FindSaleByIdAdapter implements FindSaleByIdOutputPort {

	@Autowired
	private SaleRepository saleRepository;

	@Autowired
	private SaleEntityMapper saleEntityMapper;
	
	@Override
	public Optional<Sale> find(Integer id) {
		var saleEntity = saleRepository.findById(id);
		
		return saleEntity.map(saleEntityMapper::toSale);
	}

}
