package com.acs.sale.application.ports.out;

import java.util.Optional;

import com.acs.sale.application.core.domain.Sale;

public interface FindSaleByIdOutputPort {

	Optional<Sale> find(final Integer id);
	
}
