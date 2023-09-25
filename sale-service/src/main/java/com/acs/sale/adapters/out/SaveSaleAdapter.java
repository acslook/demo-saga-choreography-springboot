package com.acs.sale.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acs.sale.adapters.out.repository.SaleRepository;
import com.acs.sale.adapters.out.repository.mapper.SaleEntityMapper;
import com.acs.sale.application.core.domain.Sale;
import com.acs.sale.application.ports.out.SaveSaleOutputPort;

@Component
public class SaveSaleAdapter implements SaveSaleOutputPort {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SaleEntityMapper saleEntityMapper;
	
	@Override
	public Sale save(Sale sale) {
		var saleEntity = saleEntityMapper.toSaleEntity(sale);
		var saleEntityResponse = saleRepository.save(saleEntity);
		return saleEntityMapper.toSale(saleEntityResponse);
	}

}
