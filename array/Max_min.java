package Array.Arrayassiment;

//Q5find max and min value of an array
import java.util.Arrays;
import java.util.Scanner;

public class Max_min {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);//scanner object
		System.out.println(" how many number you want to store");
		int b = S.nextInt();
		int a[] = new int[b];
		for (int i = 0; i < a.length; i++) {//storing value
			System.out.println("enter the numbers");
			a[i] = S.nextInt();
		}
		Arrays.sort(a);//Sorting array
		System.out.println("min is " + a[0]);//min logic  
		System.out.println("max is " + a[a.length - 1]);//max  logic
	}
}
