package aaaa;

import java.util.Scanner;

public class AverageInAStream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		float[] arr1=streamAvg(arr, n);
		for (float m:arr1)
			System.out.println(m);
	}
	static float[] streamAvg(int[] arr, int n) {
        float[] arr1=new float[n];
        arr1[0]=arr[0];
        float sum=arr[0];
        for (int i=1;i<n;i++){
            sum=sum+arr[i];
            System.out.println(sum);
            arr1[i]=sum/(i+1);
            
        }
        return arr1;
    }

}




