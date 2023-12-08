package PfQuesions;

import java.util.Scanner;

public class CharacterAtIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		if (n<0) {
			System.out.println("-1");
		}
		String st="";
		for (int i=0;i<=50;i++) {
			st+=str;
			}
		char a = 0;
		for (int i=0;i<n;i++) {
			a=st.charAt(n);
		}
		System.out.println(a);
		
		

	}

}
