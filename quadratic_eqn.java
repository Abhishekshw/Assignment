import java.util.*;
class quadratic_eqn {

	public static void main(String[] args) {
		int a,b,c;
		double d,e;
		
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		 a=sc.nextInt();
			System.out.println("enter b");
		 b=sc.nextInt();
			System.out.println("enter c");
				 c=sc.nextInt();
				d=((-b+Math.sqrt(b*b-4*a*c))/2*a);
				e=((-b-Math.sqrt(b*b-4*a*c))/2*a);
				 d=(b*b-4*a*c);
				 
				System.out.println("1st root is "+d);
				 
				System.out.println("2st root is  "+ e);
				 
	}
}