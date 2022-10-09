package Array.Arrayassiment;

//6. wajp to foind 2nd smallest element
import java.util.Arrays;
import java.util.Scanner;

public class Smallest2nd {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println(" how many number you want to store");
		int b = S.nextInt();
		int a[] = new int[b];
		for (int i = 0; i < a.length; i++) {// storing array value
			System.out.println("enter the numbers");
			a[i] = S.nextInt();
		}
		Arrays.sort(a);// shorting array
		System.out.println("2nd smallest is " + a[1]);// output for 2nd smallest
	}
}
