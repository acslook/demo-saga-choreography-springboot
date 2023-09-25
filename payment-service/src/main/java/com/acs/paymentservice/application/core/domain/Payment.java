package com.acs.paymentservice.application.core.domain;

import java.math.BigDecimal;

public class Payment {

	public Payment() {
		
	}
	
	public Payment(Integer id, Integer userId, Integer saleid, BigDecimal value) {
		super();
		this.id = id;
		this.userId = userId;
		this.saleid = saleid;
		this.value = value;
	}

	private Integer id;
	
	private Integer userId;
	
	private Integer saleid;
	
	private BigDecimal value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSaleid() {
		return saleid;
	}

	public void setSaleid(Integer saleid) {
		this.saleid = saleid;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
}
