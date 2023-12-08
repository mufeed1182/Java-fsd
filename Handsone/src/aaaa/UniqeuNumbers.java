package aaaa;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class UniqeuNumbers {
	
	public static int sumOfnumbers(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
		
	} 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first input: ");
		int x=sc.nextInt();
		System.out.println("Enter the second Input: ");
		int y=sc.nextInt();
		
		if (x==sumOfnumbers(y) && y==sumOfnumbers(x)) {
			System.out.println("Yes");
			for(int i=1;i<x;i++) {
				if(x%i==0) {
					System.out.print(" "+i );
				}
			}
				System.out.println("\n");
				for(int j=1;j<y;j++) {
					if(y%j==0) {
						System.out.print(" "+j);
					}
				}
		
			
				
//				 {
//					if(sumOfNumber1>i) {
//						if (sumOfNumber2>i) {
//							System.out.println("Yes");
//							System.out.print(i+" ");
//							System.out.print(i+" ");
					}
			
//			if (x==sumOfnumbers(y)&& (y==sumOfnumbers(x))) {
//				
//				System.out.println("Yes");	
//		}else {
//			System.out.println("No");
//		}
//		}
		

	}
		
}
			

