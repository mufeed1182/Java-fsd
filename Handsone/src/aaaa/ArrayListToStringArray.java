package aaaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> str=new ArrayList<String>();
		for (int i=0;i<n;i++) {
			String detail=sc.next();
			str.add(detail);
		}
		Collections.sort(str);
		String[] arr1=str.toArray(new String[0]);
		for (String s:arr1) {
			System.out.println(s);
		}

	}
}
