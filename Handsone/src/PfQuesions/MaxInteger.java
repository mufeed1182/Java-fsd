package PfQuesions;

import java.util.Scanner;

public class MaxInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		while(sum<n) {
			sum+=(i*(i+1)/2);
			i++;
		}
		System.out.println(i-1);

	}

}
