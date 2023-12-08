package aaaa;

import java.util.Scanner;

public class AbundentNumber {

	public static int properDevisor(int n) {
		int sum=0;
		for (int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first limit: ");
		int x=sc.nextInt();
		System.out.println("Enter the second limit: ");
		int y=sc.nextInt();
		boolean number=false;
		for (int j=x;j<y;j++) {
			int sumOfDevisors=properDevisor(j);
			if (sumOfDevisors>j) {
				System.out.print(j+",");
				number=true;
			}
		}
		if(!number) {
			System.out.println("-1");
		}
		sc.close();
	}

	}
