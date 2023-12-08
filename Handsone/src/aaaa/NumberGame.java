package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class NumberGame {
    public static int numberGame(int A,int B,int M){
        int num1=A;
        int num2=B;
        int count=0;
        while(num1<=M /*|| num2<=M*/){
            num1=Math.max(num1+num2, num2);
//            num2=Math.max(num1, num1+num2);
            count++;
            if (count>M) {
            	return -1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A;
        A=scan.nextInt();
        int B;
        B=scan.nextInt();
        int M;
        M=scan.nextInt();
        int result;
        result = numberGame(A,B,M);
        System.out.print(result);
        return ;
    }
}
