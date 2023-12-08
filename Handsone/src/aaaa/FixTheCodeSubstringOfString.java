package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;


public class FixTheCodeSubstringOfString {
	public static int isprime(int n){

	      for(int i = 2; i<=Math.sqrt(n); i++){
	        if(n%i==0)
	          return 0;
	      }

	      return 1;
	   }
    public static int evenPrimes(int N, List<Integer> A) {
        int sum=0;
        for (int i=0;i<N;i++){
            for (int j=3;j<A.get(i);j++){
                if (A.get(i)%j==0 && isprime(j)==1){
                    sum+=A.get(i);
                }
            }
        }
        return sum;

        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int N = Integer.parseInt(scan.nextLine().trim());
        
        List<Integer> A = new ArrayList<>(N);
        for(int j=0; j<N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }
    
        int result = evenPrimes(N, A);
    
        System.out.println(result);
    }
}