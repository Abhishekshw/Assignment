package Array.Arrayassiment;

import java.util.Scanner;//import Scanner 

public class Duplicate_value {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println(" how many number you want to store");
		int b = S.nextInt();
		int a[] = new int[b];
		for (int i = 0; i < a.length; i++) {// Storing value od array
			System.out.println("enter the numbers");
			a[i] = S.nextInt();
		}
		System.out.println("duplicate value is");
		for (int i = 0; i < a.length; i++) {// finding Duplicate
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");// output

				}
			}
		}
	}
}
