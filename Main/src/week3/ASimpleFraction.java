package week3;

import java.util.Scanner;

public class ASimpleFraction {
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		String s=fractionToDecimal(n, d);
		System.out.println(s);
	}
	
	static String  fractionToDecimal(int n, int d)
    {
		Double ans=(double) n/d;
		String str=ans.toString();
		String[] str1=str.split("\\.");
		int count=0;
		for(int i=0;i<str1[1].length()-1;i++) {
			if(str1[1].charAt(i)==str1[1].charAt(i+1)) {
				count++;
			}
			if(count>5) {
				return str1[0]+"."+"("+str1[1].charAt(1)+")";
			}
		}
		return str;
    }

}
