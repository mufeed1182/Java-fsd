package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer>arr=new ArrayList<>();
		for (int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		int m=sumOfdoubletAndTriplet(n, arr);
		System.out.println(m);

	}
	static int sumOfdoubletAndTriplet(int n,List<Integer> arr) {
		if (n==1) {
			return 0;
		}
		int score=0;
		for (int i=1;i<n;i++) {
			int sumD=arr.get(i-1)+arr.get(i);
			if (sumD%2==0) {
				score+=5;
			}
		}
		for (int i=2;i<n;i++) {
			int sumT=arr.get(i-2)+arr.get(i-1)+arr.get(i);
			int productT=arr.get(i-2)*arr.get(i-1)*arr.get(i);
			if (sumT%2!=0 && productT%2==0) {
				score+=10;
			}
		}
		return score;
	}

}
