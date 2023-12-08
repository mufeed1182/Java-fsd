package aaaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AddAndReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the no of array: ");
		int n=sc.nextInt();
		System.out.println("Enetr the elements of the array: ");
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int sum=0;
		for (int i=0;i<n;i++) {
			if (k<arr[i]) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		int temp=0;
		while(sum>0) {
			int digit=sum%10;
			temp=(temp*10)+digit;
			sum/=10;
			
		}
		System.out.println(temp);
		
	}

}
