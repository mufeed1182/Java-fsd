package aaaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CommonElementInAMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++) {
			for (int j=0;j<a;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				list.add(arr[i][j]);
			}
		}
		
		
		System.out.println(list);
	}
}

