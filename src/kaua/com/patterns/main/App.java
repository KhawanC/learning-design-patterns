package kaua.com.patterns.main;

import java.math.BigDecimal;

import kaua.com.patterns.interfaces.Tax;
import kaua.com.patterns.model.Budget;
import kaua.com.patterns.taxes.ICMS;
import kaua.com.patterns.taxes.ISS;
import kaua.com.patterns.taxes.PIS;
import kaua.com.patterns.utils.TaxCalculator;

public class App {
	public static void main(String[] args) {
		System.out.println("Design Patterns");
		
		Budget budget = new Budget(new BigDecimal("100.0"));
		Tax icms = new ICMS();
		Tax iss = new ISS();
		Tax pis = new PIS();
		
		TaxCalculator calculator = new TaxCalculator();
		
		BigDecimal valueICMS = calculator.calculate(budget, icms);
		BigDecimal valueISS = calculator.calculate(budget, iss);
		BigDecimal valuePIS = calculator.calculate(budget, pis);
		
		System.out.println(valueICMS);
		System.out.println(valueISS);
		System.out.println(valuePIS);
	}
}
