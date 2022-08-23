package test;
import java.util.*;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("enter 1st no");
		a=scan.nextInt();
		System.out.println("enter 2nd no");
		b=scan.nextInt();
		System.out.println("enter 3rdno");
		c=scan.nextInt();
		if(a>b&&a>c)
			System.out.println("the gretest no is"+a);
		else if(b>a&&b>c)
			System.out.println("the gretest no is"+b);
		else
			System.out.println("the gretest no is"+c);
	}

}
