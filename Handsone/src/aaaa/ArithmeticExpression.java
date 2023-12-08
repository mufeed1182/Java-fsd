package aaaa;

import java.util.Scanner;

public class ArithmeticExpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		boolean found=false;
		
		if (b+c==a) {
			System.out.println("Add");
			found=true;
		}
		if(b-c==a) {
			System.out.println("Substract");
			found=true;
		}
		if (b*c==a) {
			System.out.println("Multiply");
			found=true;
		}
		if (b/c==a) {
			System.out.println("Divide");
			found=true;
		}
		if (b%c==a) {
			System.out.println("Modulo");
			found=true;
		}
		if (!found) {
            System.out.println("Not Possible");
        }
		
	}

}
