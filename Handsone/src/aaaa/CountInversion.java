package aaaa;

import java.util.Scanner;

public class CountInversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long[] arr=new long[(int)N];
		for (int i=0;i<N;i++) {
			arr[i]=sc.nextLong();
		}
		long result=inversionCount(arr, N);
		System.out.println(result);

	}
	static long inversionCount(long arr[], long N)
    {
        long count=0;
        for (int i=0;i<N;i++){
            for (int j=1;j<N;j++) {
            	if (arr[i]>arr[j]&&i<j) {
            		count++;
            	}
            }
        }
        return count;
        
    }

}
