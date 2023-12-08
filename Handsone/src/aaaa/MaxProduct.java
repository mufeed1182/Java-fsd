package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<n;i++) {
			for (int j=0;j<i;j++) {
				int product=arr[i]*arr[j];
				list.add(product);
			}
		}
		int MaxValue=Integer.MIN_VALUE;
		for(Integer integer:list) {
			if(integer>MaxValue) {
				MaxValue=integer;
			}
		}
		System.out.println(MaxValue);
	}

}
