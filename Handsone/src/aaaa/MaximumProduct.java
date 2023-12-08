package aaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MaximumProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the Array: ");
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				int element=arr[i]*arr[j];
				list.add(element);
			}
		}
		//Set<Integer> list2=new TreeSet<>();
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if (list.contains(arr[i])) {
				list1.add(arr[i]);
			}
			
		}
		int maxValue = Integer.MIN_VALUE;
		for (Integer integer : list1) {
            if (integer > maxValue)
                maxValue = integer;
        }
        System.out.println(maxValue);
		

	}

}
