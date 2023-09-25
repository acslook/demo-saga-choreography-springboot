package com.acs.sale.adapters.in.controller.mapper;

import org.mapstruct.Mapper;

import com.acs.sale.adapters.in.controller.request.SaleRequest;
import com.acs.sale.application.core.domain.Sale;

@Mapper(componentModel = "spring")
public interface SaleRequestMapper {

	Sale toSale(SaleRequest saleRequest);
	
}
