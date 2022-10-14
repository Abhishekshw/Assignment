package com.cognizant.tax;

public class TaxCalculator {
	// problem statment 1//declearing instatnce variable
	float basicSalary, tax;
	boolean citizenship;
	int netttSalary;

//problem statment 2
	void calculateTax() {// creating method
		tax = (30 * basicSalary / 100);
		System.out.println("The Tax of the employee for the " + (int) basicSalary + " is " + (int) tax);
	}

	// problem statment 3
	void deductTax() {
		int netttSalary = (int) (basicSalary - tax);// casting float to int
		System.out.println("thr  nett Salary of the emplooyee " + netttSalary);
	}

	// problem statment 4
	void validateSalary() {
		boolean b = (basicSalary > 100000);
		System.out.println("The salary And citizenship eligibility :" + b);
	}
}
