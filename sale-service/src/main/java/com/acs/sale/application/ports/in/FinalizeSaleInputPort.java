package com.acs.sale.application.ports.in;

import com.acs.sale.application.core.domain.Sale;

public interface FinalizeSaleInputPort {

	void finalize(Sale sale);
	
}
