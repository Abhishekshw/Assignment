package test;
import java.util.*;//for importn scanner
public class leapyear {
	public static void main(String []args) {
		int year;//declearing
	Scanner sc=new Scanner(System.in);//scanner object
	System.out.println("enter year");
	year=sc.nextInt();//storing value
	if(year%4==0) {//logic of leap year
		System.out.print(year +" is leap year");
		
	}
	else {
		System.out.println("not  a leap year");
	}
		
	}

}
