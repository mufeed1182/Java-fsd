package aaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TwistedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array: ");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the number of K: ");
		int k=sc.nextInt();
		//int[] arr1=new int[n];
		List<Integer> arr1=new ArrayList<>();
		for (int i=0;i<k+1;i++) {
			arr1.add(arr[i]);
		}
		for (int i=n-1;i>k;i--) {
			
			arr1.add(arr[i]);
		}
		//System.out.println(arr1);
		Object[] objects = arr1.toArray();
		for (Object obj : objects)
            System.out.print(obj + " ");
		
	}

}
