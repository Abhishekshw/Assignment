package test;
//WJP to print numbers between 1 to 200 which are divisible by 5, 7 and by both.


public class Div_org {
	public static void main(String[] args) {
		for(int o=1;o<=200;o++) {
			if(o%5==0||o%7==0) {
				System.out.println(o);
			}
			}
		}
	}


