package aaaa;

import java.util.Scanner;

public class SimpleStringManipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s1="";
		//System.out.println(str);
		//char[] str1=str.toCharArray();
			if (str.charAt(0)=='j' && str.charAt(1)=='b' ) {
				s1=str;
				System.exit(0);
			}else if(str.charAt(0)=='j') {
				s1='j'+str.substring(2, str.length());
			}else if(str.charAt(1)=='b') {
				s1=str.substring(1, str.length());
			}else {
				s1=str.substring(2, str.length());
			}
		
		System.out.println(s1);
	}

}
