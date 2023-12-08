package aaaa;
import java.util.regex.*;
import java.util.Scanner;

public class colorCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		if (s1.matches("[#]{1}[A-F0-9]{6}")) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
		

	}

}		
