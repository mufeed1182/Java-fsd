package JavaQuestions;

import java.util.Scanner;

public class FormingNewWordFromAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		String s1=str.substring(0, n);
		String s2=str.substring(str.length()-n, str.length());
		System.out.println(s1+s2);

	}

}
