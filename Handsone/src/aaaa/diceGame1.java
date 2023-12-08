package aaaa;

import java.util.Scanner;

//import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;

public class diceGame1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int n1=sc.nextInt();
		System.out.println("Enter value 2: ");
		int n2=sc.nextInt();
		if (n1 >6 && n2>6) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		if (n1==n2) {
			int sum=2*(n1+n2);
			System.out.println("The point scored is : "+sum);
		}else {
			int sum=n1+n2;
			System.out.println("The point scored is : "+sum);
		}
		
		

	}

}
