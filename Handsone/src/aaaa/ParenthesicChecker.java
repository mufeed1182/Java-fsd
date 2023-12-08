package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParenthesicChecker {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		boolean flag=ispar(x);
		System.out.println(flag);
		
	}
	static boolean ispar(String x)
    {
         if (x.length()==1){
             return false;
         }
        // boolean flag=true;
        for (int i=0;i<x.length();i++) {
        	if(x.charAt(i)=='{'&&x.charAt(x.length()-i-1)=='}'||x.charAt(i)=='['&&x.charAt(x.length()-i-1)==']'||x.charAt(i)=='('&&x.charAt(x.length()-i-1)==')') {
        		return true;
        	}
        }
        return false;
    }

}
