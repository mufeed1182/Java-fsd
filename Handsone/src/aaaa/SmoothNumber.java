package aaaa;

import java.util.Scanner;

public class SmoothNumber {

	public static void main(String[] args) throws IndexOutOfBoundsException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for (int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
			//System.out.println(arr);
			//System.out.println(arr[0]);
	
				int first=arr[0];
				int last=arr[num-1];
				int mid=0;
				if (num%2!=0) {
					int odd=(num-1)/2;
					mid=arr[odd];
				}else {
					int even=num/2;
					mid=arr[even]+arr[even-1];
				}
				
				System.out.println(first+" "+mid+" "+last);
				if((first==last)&&(last==mid)) {
					System.out.println("True");
				}else {
					System.out.println("False");
				}
				sc.close();
			}
			
			
			}
		
	