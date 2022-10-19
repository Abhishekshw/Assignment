package Exeption;
/*You will be given two integers x and y as input, you have to compute x/y. If x and y are 
not 32 bit signed integers or if y is zero, exception will occur and you have to report it. 
Read sample Input/Output to know what to report in case of exceptions.
*/
import java.util.Scanner;//importing scanner class

public class Exceptions {
	static void Operation() {//Ststicv method
		Scanner S = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int x = S.nextInt();//Asking value
		System.out.println("enter 2nd no");
		int y = S.nextInt();
		try {//try block
			System.out.println(x / y);
		} catch (Exception e) {//catch exeption
			System.out.println(e);//Showing Exeption
		}
	}

	public static void main(String[] args) {
		Operation();//calling method
	}
}
