package aaaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MaximumOfAllSubArraysOfSizeK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<arr.length-k+1;i++) {
			List<Integer> list1=new ArrayList<>();
			for (int j=i;j<i+k;j++) {
				list1.add(arr[j]);
			}
			Collections.sort(list1);
//			System.out.println(list1);
			int m=list1.get(list1.size()-1);
//			System.out.println(m);
			list.add(m);
			list1.clear();
		}
		System.out.println(list);

	}

}
