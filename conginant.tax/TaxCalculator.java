package com.cognizant.tax;

/*Hands-on Exercise Objective
After completing the hands-on exercises, you will be able to:
•	You will learn about the usage of arithmetic, relational, logical operators and type casting.
Scenario: Developers need to develop a tax calculator for calculating tax using arithmetic, relational and logical operators.
Problem Statement 1: Declaring instance variables.
Develop a class “TaxCalculator” inside a package “com.cognizant.tax”. The class should have an instance float variable named “basicSalary” and a boolean variable  named “citizenship”.
Problem Statement 2: Usage of Arithmetic operators.
In the TaxCalculator class  create a method named  calculateTax()  that  should calculate and print the tax, the tax should  be calculated as follows
tax = 30*basic salary/100
NOTE: The value stored in the instance variable” basicSalary” should be used in the above calculation.
The calculated tax needs to be stored in another instance float variable “tax”.
This method will display the following message in the console.
“The Tax of the employee  for  the   <basic Salary> is <tax>”
Problem Statement 3: How to type cast?
In the TaxCalculator class  create a method named  deductTax() method this should reduce the tax calculated in problem statement 1 from  the basic salary and store it in a  instance int variable named  “nettSalary”.
NOTE:  Ensure to use casting for converting float to int.
This method will also display the following message in the console.
“The nett salary of the employee” <nettSalary>

Problem Statement 4: Usage of relational operator
In the TaxCalculator class  create a method named  validateSalary() method should display a message as below if the basicSalary  is greater than 1 lakh  and  citizenship is true.
“The salary and citizenship eligibility:  ” <response>
<response> - The value would be printed as true if basic salary > 1 lakh and citizenship is true.
The value would be printed as false for other conditions.
Problem Statement 5: Execute the methods
 Develop another class “EmployeeTax”  inside the package “ com.cognizant.tax” add a main method which sets the values and invoke the following methods in the TaxCalculator  object.
Test Case 1:  Specify the following values and run the main method
1.	Set  the value of citizenship as true, basicSalary as 25000.
2.	Invoke the methods calculateTax(), deductTax(), validateTax().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   25000 is 7500
The nett salary of the employee 17500
The salary and citizenship eligibility:  false
Test Case 2:  Specify the following values and run the main method
1.	Set  the value of citizenship as true, basicSalary as 125000.
2.	Invoke the methods calculateTax(), deductTax(), validateTax().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   125000 is 37500
The nett salary of the employee 87500
The salary and citizenship eligibility:  true

*/
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
