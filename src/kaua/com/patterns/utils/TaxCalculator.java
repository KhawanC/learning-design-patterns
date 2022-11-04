package kaua.com.patterns.utils;

import java.math.BigDecimal;

import kaua.com.patterns.interfaces.Tax;
import kaua.com.patterns.model.Budget;

public class TaxCalculator {

	public BigDecimal calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}
}
