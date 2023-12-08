package JavaQuestions;

import java.util.Collections;
import java.util.Scanner;

public class FlushCharacteres {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=s1.replaceAll("[a-zA-Z]", "");
		System.out.println(s2);

	}

}
