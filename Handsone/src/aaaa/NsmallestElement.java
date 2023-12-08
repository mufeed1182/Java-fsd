package aaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NsmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr2=nElement(arr, n, m);
		for (int a:arr2) {
			System.out.print(a+" ");
		}
		

	}
	static int[] nElement(int[] arr,int n,int m) {
		
		int[] copyarr=arr.clone();
		Arrays.sort(copyarr);
		int[] arr2=new int[m];
		for (int i=0;i<m;i++) {
			arr2[i]=copyarr[i];
		}
		List<Integer>list=new ArrayList<>();
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (arr[i]==arr2[j]) {
					list.add(arr[i]);
				}
			}
		}
		int[] arr3=new int[m];
		for (int i=0;i<m;i++) {
			arr3[i]=list.get(i);
		}
		return arr3;
	}

}
