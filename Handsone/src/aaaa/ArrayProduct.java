package aaaa;

import java.util.List;
import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the no of elements in Array: ");
		int n=sc.nextInt();
		if (n<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		System.out.println("Enetr the elements in the array: ");
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if (arr[i]<0) {
				System.out.println("Invalid Input");
				System.exit(0);
			}	
		}
		int product1=1;
		for (int i=0;i<n;i++) {
			int product=1;
			if (arr[i]>9 &&arr[i]<=99) {
				product=arr[i];
				
			}
			product1*=product;
			
		}
		System.out.println("Product of two digit number is = "+product1);
		

	}

}
