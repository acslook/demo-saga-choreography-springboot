package com.acs.sale.application.ports.out;

import com.acs.sale.application.core.domain.Sale;

public interface SaveSaleOutputPort {
	Sale save(Sale sale);
}
