package com.acs.sale.application.core.usecase;

import com.acs.sale.application.core.domain.Sale;
import com.acs.sale.application.core.domain.enums.SaleStatus;
import com.acs.sale.application.ports.in.FinalizeSaleInputPort;
import com.acs.sale.application.ports.in.FindSaleByIdInputPort;
import com.acs.sale.application.ports.out.SaveSaleOutputPort;

public class FinalizeSaleUseCase implements FinalizeSaleInputPort {

	private final FindSaleByIdInputPort findSaleByIdInputPort;
	
	private final SaveSaleOutputPort saveSaleOutputPort;
	
	public FinalizeSaleUseCase(
			FindSaleByIdInputPort findSaleByIdInputPort,
			SaveSaleOutputPort saveSaleOutputPort) {
		this.findSaleByIdInputPort = findSaleByIdInputPort;
		this.saveSaleOutputPort = saveSaleOutputPort;
	}
	
	@Override
	public void finalize(Sale sale) {
		var saleResponse = findSaleByIdInputPort.find(sale.getId());
		
		saleResponse.setStatus(SaleStatus.FINALIZED);
		
		saveSaleOutputPort.save(sale);
	}
	
}
