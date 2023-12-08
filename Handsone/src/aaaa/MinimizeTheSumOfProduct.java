package aaaa;

import java.util.Scanner;

public class MinimizeTheSumOfProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long[] a=new long[(int) n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		long[] b=new long[(int) n];
		for (int i=0;i<n;i++) {
			b[i]=sc.nextLong();
		}
		long result=minValue(a, b, n);
		System.out.println(result);
		

	}
	public static long minValue(long a[], long b[], long n) 
    {
        long min=0;
        for (int i=0;i<n;i++){
            long sum=0;
            long sum2=0;
            for (int j=0;j<n;j++){
                long sum1=a[i]*b[j];
                sum=sum1;
                while(sum>sum1) {
                	sum2+=sum1;
                }
                
            }
            min+=sum2;
            
        }
        return min;
    }

}
