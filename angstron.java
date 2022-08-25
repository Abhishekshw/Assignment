package test;
import java.util.*;//for scanner
public class angstron {
	public static void main(String []args) {
		int number,result=0,a,c;//starting;
		Scanner sc=new Scanner(System.in);//scanner object
		System.out.println("enter number");
		number=sc.nextInt();//storing number;
		c=number;
		while(c!=0) {//logic
		a=c%10;
		result+=a*a*a;
		c=c/10;

		}
		if (result==number) {
			System.out.println("enter number is angstron number");
		}
		else{
				System.out.println("not a angstron no");
			}
		}
		
	}


