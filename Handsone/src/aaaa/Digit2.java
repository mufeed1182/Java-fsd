package aaaa;

import java.util.Scanner;

public class Digit2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0||sum>9) 
		{
			if(n==0) {
				n=sum;
				sum=0;
			} 
			int digit=n%10;
			sum+=digit;
			n/=10;
			
		}
		System.out.println(sum);
//		int num=0;
//		if (sum>9)
//			while(sum>0) {
//			int digit1=sum%10;
//			num+=digit1;
//			sum/=10;
//		}
//		System.out.println(num);

	}

}
