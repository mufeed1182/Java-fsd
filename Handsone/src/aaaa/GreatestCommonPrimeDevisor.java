package aaaa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GreatestCommonPrimeDevisor {
	
	public static  boolean isprime(int n) {
		if (n<=2) {
			return false;
		}
		for  (int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num: ");
		int num1=sc.nextInt();
		System.out.println("Enter second num: ");
		int num2=sc.nextInt();
		Set<Integer> arr1= new HashSet<>();
		for (int i=1;i<num1;i++) {
			if (num1%i==0 && isprime(i)) {
				arr1.add(i);
			}
		}
		Set<Integer> arr2= new HashSet<>();
		for (int i=1;i<num2;i++) {
			if(num2%i==0&&(isprime(i))) {
				arr2.add(i);
			}
		}
		if (arr1.equals(arr2)) {
			System.out.println(arr1);
		}else {
			System.out.println("-1");
		}
		
			
		}
			
		}

