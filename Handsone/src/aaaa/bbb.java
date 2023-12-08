package aaaa;

import java.util.Arrays;
import java.util.Scanner;

public class bbb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	num+=arr[i];
        }
        System.out.println(num);
        Arrays.sort(arr);
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        
        int[] arr1=new int[2];
        for (int i=1;i<=n;i++){
            if (arr[i-1]!=i){
                arr1[1]=arr[i-1];
                break;
                
            }
        }
        arr1[0]=sum-num;

        
        for (int a:arr) {
        	System.out.print(a+" ");
        }
        System.out.println();
//        for (int b:arr2) {
//        	System.out.print(b+" ");
//        }
        System.out.println();
        for (int c:arr1) {
        	System.out.print(c+" ");
        }

	}

}
