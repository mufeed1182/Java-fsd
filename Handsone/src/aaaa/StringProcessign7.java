package aaaa;

import java.util.Scanner;

public class StringProcessign7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int n=sc.nextInt();
		String rev="";
		for (int i=0;i<a.length();i++) {
			char ch=b.charAt(i);
			rev=ch+rev;
		}
		//System.out.println(rev);
		boolean flag=false;
		if(a.charAt(n)==rev.charAt(n)) {
			flag=true;
		}else {
			flag=false;
		}
		
		System.out.println(flag);
	}

}
