import java.util.Scanner;
public class RevArr {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);	
	System.out.println("enter the string or number");
String in=S.next();
int m=in.length();//length 
char c[]=new char[m];
char d[]=new char[m];
for(int i=0;i<m;i++) {//char to array
	char j=in.charAt(i);
	c[i]=j;
}
for(int i=m-1;i>=0;i--) {//reverse the array
	d[i]=c[m-1-i];
}
for(int i=0;i<m;i++) {//view output
	System.out.print(d[i]);
}
}
	}