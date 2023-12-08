package aaaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int list=findOnce(arr, n);
		System.out.println(list);

	}
	static int findOnce(int arr[], int n)
    {
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<n;i++) {
			for (int j=1;j<n;j++) {
				if (arr[i]==arr[j]) {
					list.add(arr[i]);
					list.add(arr[j]);
					i+=2;
					j+=2;
				}
			}
		}
		List<Integer> list1=new ArrayList<>();
		for (int i=0;i<n;i++) {
			list1.add(arr[i]);
		}
		list1.removeAll(list);
		return list1.get(0);
        
    }
	 

}
