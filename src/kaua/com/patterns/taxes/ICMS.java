package kaua.com.patterns.taxes;

import java.math.BigDecimal;

import kaua.com.patterns.interfaces.Tax;
import kaua.com.patterns.model.Budget;

public class ICMS implements Tax{

	public BigDecimal calculate(Budget orcamento) {
		return orcamento.getValue().multiply(new BigDecimal("0.01"));
	}
}
