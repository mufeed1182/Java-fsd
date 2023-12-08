package PfQuesions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		String str="";
		for(int s:arr) {
			str+=s;
		}
		int a=Integer.parseInt(str);
		int b=a+m;
		List<Integer> list=new ArrayList<>();
		while(b>0) {
			int digit=b%10;
			list.add(digit);
			b/=10;
		}
		Collections.reverse(list);
		for (int e:list) {
			System.out.print(e+" ");
		}
		

	}

}
