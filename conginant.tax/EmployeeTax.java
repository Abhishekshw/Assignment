package com.cognizant.tax;

import java.util.Scanner;

//problem statment 5
public class EmployeeTax {
	public static void main(String[] args) {// main method
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println("enter Saslary");
		int Sal = S.nextInt();// Storing salary
		TaxCalculator t = new TaxCalculator();// object of Taxcalculator
		t.basicSalary = Sal;// invoking values
		t.calculateTax();// method calling
		t.deductTax();// method calling
		t.validateSalary();// method calling
	}
}
