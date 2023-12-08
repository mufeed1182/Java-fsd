package aaaa;

import java.util.Scanner;

public class BoatTravel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ideal speed of boat: ");
		int a=sc.nextInt();
		System.out.println("Enter the speed of waterflow: ");
		int b=sc.nextInt();
		System.out.println("Enetr the Distence to be covered: ");
		int c=sc.nextInt();
		int result=c/(a+b);
		System.out.println(result);

	}

}
