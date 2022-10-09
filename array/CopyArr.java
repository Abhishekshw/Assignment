package Array.Arrayassiment;

//Q3ccopy array
import java.util.Scanner;

public class CopyArr {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);//scanner obj
		System.out.println("enter total number you wnt to store");
		int a = S.nextInt();
		int b[] = new int[a];//orginal array
		int c[] = new int[a];//copy array
		for (int i = 0; i < a; i++) {//input of array
			System.out.println("enter element of array");
			b[i] = S.nextInt();
		}
		for (int i = 0; i < a; i++) {//coping in new array
			c[i] = b[i];
		}
		System.out.println("frist array is");//display value
		for (int i = 0; i < a; i++) {
			System.out.print(+c[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("2nd array is");
		for (int i = 0; i < a; i++) {//display value
			System.out.print(b[i]);
			System.out.print(" ");
		}
	}
}
