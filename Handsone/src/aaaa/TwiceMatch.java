package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class TwiceMatch {
    public static int twiceMatch(int[] A){
        int n=A.length;
        int mod = 1000000007;
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<n+1;i++){
            list.add((int) Math.pow(2,i));
        }
        int count=0;
        for (int i=0;i<n;i++){
        	int j=1;
        	while(j<n) {
        		int complement = (2 * ) % (mod + 1);
        		if (i<j && list.contains(A[i]+A[j])) {
        			count++;
        		}
        		j++;
        	}
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] A = new int[N];
        for(int j=0;j<N;j++){
            A[j]=scan.nextInt();
        }
        int result;
        result = twiceMatch(A);
        System.out.print(result);
//        List<Integer> list=twiceMatch(A);
//        for (int a:list) {
//        	System.out.print(a+ " ");
//        }
        return ;
    }
}
