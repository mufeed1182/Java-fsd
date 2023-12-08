package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunLength4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int maxL=0;
		int maxI=0;
		int curL=0;
		int curI=0;
		for (int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				
				if(curL==0) {
					curI=i;
					
				}
				curL++;
			}
			
			else {
				if(curL>maxL) {
					maxL=curL;
					maxI=curI;
				}
				curL=0;
			}
			
		}
		if(maxL<curL) {
			maxL=curL;
			maxI=curI;
		}
		System.out.println(maxL);
		System.out.println(maxI);

	}

}
