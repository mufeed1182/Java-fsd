package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class PalindromeInAString {
    public static int scoreString(String str){
        int score=0;
        StringBuilder sb1=new StringBuilder();
        for (int i=0;i<=str.length()-4;i++) {
        	sb1.append(str.substring(i, i+4));
        	String s1=sb1.toString();
        	String s2=sb1.reverse().toString();
        	if (s1.equals(s2)) {
        		score+=5;
        	}
        	sb1.delete(i, i+4);
        }
        
        StringBuilder sb2=new StringBuilder();
        for (int i=0;i<str.length()-5;i++) {
        	sb2.append(str.substring(i, i+5));
        	String s3=sb2.toString();
        	String s4=sb2.reverse().toString();
        	if (s3.equals(s4)) {
        		score+=10;
        	}
        	sb2.delete(i, i+5);	
        }	
        return score;
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        str=scan.next();
        int result;
        result = scoreString(str);
        System.out.print(result);
        return ;
    }
}