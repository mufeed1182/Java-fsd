package aaaa;

import java.util.Scanner;

public class MatrxiRotations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int[][] arr1=rotatedMatrix(n, arr);
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static int[][] rotatedMatrix(int n,int[][] arr){
		int[][] arr1=arr.clone();
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (arr[i][j]==1) {
					arr1[Math.abs(i-(n-1))][j]=1;
					arr1[Math.abs(i-(n-1))][Math.abs(j-(n-1))]=1;
					arr1[i][Math.abs(j-(n-1))]=1;
				}
			}
		}
		return arr1;
		
	}

}
