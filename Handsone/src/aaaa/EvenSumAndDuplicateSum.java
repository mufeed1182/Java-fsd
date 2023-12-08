package aaaa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EvenSumAndDuplicateSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		Set<Integer> list=new HashSet<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if (arr[i]%2==0) {
				list.add(arr[i]);
			}
		}
		int sum = 0;
		if(list.size()==0) {
			System.out.println("-1");
			System.exit(0);
		}else {
		
			for( int i : list) {
				sum += i;
		}
		}

		System.out.println(sum);
		
	}

}
