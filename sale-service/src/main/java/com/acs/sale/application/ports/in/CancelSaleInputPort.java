package com.acs.sale.application.ports.in;

import com.acs.sale.application.core.domain.Sale;

public interface CancelSaleInputPort {

	void cancel(Sale sale);
	
}
