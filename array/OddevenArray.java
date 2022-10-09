package Array.Arrayassiment;

//Q8//total even print odd print
import java.util.Scanner;

public class OddevenArray {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);// Scanner obj
		System.out.println(" how many number you want to store");
		int b = S.nextInt();
		int a[] = new int[b];// creating array
		for (int i = 0; i < a.length; i++) {// giving value
			System.out.println("enter the numbers");
			a[i] = S.nextInt();
		}
		System.out.println("even no is");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {// condition for even
				System.out.print(a[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("odd no is");
		for (int k = 0; k < a.length; k++) {
			if (a[k] % 2 != 0) {// condition for odd
				System.out.print(a[k] + " ");
			}
		}

	}
}
