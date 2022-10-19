package Exeption;

import java.util.Scanner;

public class Exceptions {
	static void Operation() {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int x = S.nextInt();
		System.out.println("enter 2nd no");
		int y = S.nextInt();
		try {
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Operation();
	}
}
