package kaua.com.patterns.taxes;

import java.math.BigDecimal;

import kaua.com.patterns.interfaces.Tax;
import kaua.com.patterns.model.Budget;

public class PIS implements Tax {

	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

}
