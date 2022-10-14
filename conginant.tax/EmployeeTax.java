package com.cognizant.tax;

//problem statment 5
public class EmployeeTax {
	public static void main(String[] args) {// main method

		TaxCalculator t = new TaxCalculator();// object of Taxcalculator
		t.basicSalary = 25000;// invoking values
		t.calculateTax();// method calling
		t.deductTax();// method calling
		t.validateSalary();// method calling
		t.basicSalary = 125000;// invoking values
		t.calculateTax();// method calling
		t.deductTax();// method calling
		t.validateSalary();// method calling
	}
}
