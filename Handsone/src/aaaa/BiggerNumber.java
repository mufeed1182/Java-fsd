package aaaa;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		while(num!=0) {
			int digit=num%10;
			for (int i=digit+1;i<=9;i++) {
				count++;
			}
			num /=10;
		}
		System.out.println(count);
		
	}
	
}
