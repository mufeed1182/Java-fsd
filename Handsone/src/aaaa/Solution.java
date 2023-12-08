package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution {
    public static int smart_santa(int N,int[] A,int[] B){
        int count=0;
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<N;i++) {
        	list.add(B[i]);
        }
        for (int i=0;i<N;i++) {
        	for (int j=0;j<list.size();j++) {
        		if (A[i]<=list.get(j)) {
        			list.remove(list.get(j));
        		}
        	}
        }
        
        return list.size();
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] A = new int[N];
        for(int j=0;j<N;j++){
            A[j]=scan.nextInt();
        }
        int[] B = new int[N];
        for(int j=0;j<N;j++){
            B[j]=scan.nextInt();
        }
        int result;
        result = smart_santa(N,A,B);
        System.out.print(result);
        return ;
    }
}