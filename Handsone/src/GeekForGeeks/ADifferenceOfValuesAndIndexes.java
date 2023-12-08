package GeekForGeeks;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ADifferenceOfValuesAndIndexes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=maxDifference(arr, n);
		System.out.println(result);

	}

	public static int maxDifference(int arr[],int n) {
		int[] arr1=arr.clone();
		Arrays.sort(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[n-1]);
		int u=0;
		int l=0;
		for(int i=0;i<n;i++) {
			if(arr1[0]==arr[i]) {
				l=i;
				
			}else if(arr1[n-1]==arr[i]) {
				u=i;
				
			}
		}
		System.out.println(l);
		System.out.println(u);
		int result=Math.abs(arr1[n-1]-arr1[0])+Math.abs(u-l);
		return result;
	}
}
