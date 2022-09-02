package com.cognizant.shapes;

public class Rectangle {
	static void CalculateArea() {//method created
		System.out.println("The Area of the rectangle calculated using the formula lenght*breadth");
	}

}
class Areacalculator{
	public static void main(String []args) {//main method
		Rectangle cal= new Rectangle();//new reff of class
		cal.CalculateArea();//merhod calling
		}
}