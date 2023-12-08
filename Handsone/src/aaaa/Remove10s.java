package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove10s {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<n;i++) {
			if (arr[i]!=10) {
				list.add(arr[i]);
			}
			
		}
		for (int i=0;i<n;i++) {
		if (list.size()!=arr.length) {
			list.add(0);
		}
		}
		System.out.println(list);
//		Object object=new Object();
//		Object[] objects = list.toArray();
//		for (Object obj : objects)
//            System.out.println(obj + " ");
		

}
}
