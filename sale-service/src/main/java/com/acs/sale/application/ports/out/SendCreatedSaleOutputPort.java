package com.acs.sale.application.ports.out;

import com.acs.sale.application.core.domain.Sale;
import com.acs.sale.application.core.domain.enums.SaleEvent;

public interface SendCreatedSaleOutputPort {
	void send(Sale sale, SaleEvent event);
}
