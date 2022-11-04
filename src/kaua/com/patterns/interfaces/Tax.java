package kaua.com.patterns.interfaces;

import java.math.BigDecimal;

import kaua.com.patterns.model.Budget;

public interface Tax {

	BigDecimal calculate(Budget budget);
}
