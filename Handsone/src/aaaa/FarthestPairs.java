package aaaa;
import java.io.*;
import java.util.*;
import java.lang.Math;


public class FarthestPairs {
    public static int farthestPairs(int N, int[] arr) {
    int maxDiff = -1;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (arr[i] < arr[j]) {
          maxDiff = Math.max(maxDiff, j - i);
        }
      }
    }
    return maxDiff;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++) {
        	arr[i]=scan.nextInt();
        }   
        int result = farthestPairs(N, arr);    
        System.out.println(result);
    }
}
