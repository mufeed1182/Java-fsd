package aaaa;

import java.util.Scanner;

public class PercentageOfRuns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		double four=4*y;
		double six=6*z;
		double total=four+six;
		double rw=x-total;
		double result=(rw/x)*100;
		System.out.printf("%.2f",result);

	}

}
