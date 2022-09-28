import java.util.Scanner;
public class ArrayAvg {
static	double sum=0;
 public static void main(String[] args) {
		
	Scanner S=new Scanner(System.in);
		System.out.println("how many number you want avrage");
int k=S.nextInt();
double a[]=new double[k];
for(int j=0;j<a.length;j++) {
	System.out.println("enter num");
	a[j] =S.nextDouble();
	}
for(int i=0;i<a.length;i++) {
	double b=a[i];
	sum=sum+b;
	}
double avg=sum/k;
System.out.println("the avg of given no is "+avg);

}
}