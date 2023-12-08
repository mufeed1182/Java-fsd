package aaaa;

import java.util.Scanner;

public class diceGame2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int n1=sc.nextInt();
		System.out.println("Enter value 2: ");
		int n2=sc.nextInt();
		if (n1>6 || n2>6) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int sum=n1+n2;
		int abs=Math.abs(8-sum);
		if (sum>8) {
			abs=2*abs;
			System.out.println("The point scored is : "+abs);
		}else {
			System.out.println("The point scored is : "+abs);
		}

	}

}
