package Array.Arrayassiment;
//Q1 find index of array element
import java.util.*;
public class Arrayindex {
	static int count=0;
public static void main(String[] args) {
	int a[]= {2,5,8,7,45,6,3,9,7};//Array 
	Scanner S=new Scanner(System.in);//Scanner obj
System.out.println("enter the number of which element you want");
	int b=S.nextInt();//no if input
	for( int i=0;i<a.length;i++) {
	count=count+1;//how many times loop has run
		if(a[i]==b) {
		break;//NEEW
	}
				}
		int c=count-1;//no of run -1 to get index no
	System.out.println("the index of "+ b+ " is " +c);
	}
	
}

