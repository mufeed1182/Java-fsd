package JavaQuestions;

import java.util.Scanner;

public class DeciamltoBineryConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		String binery=Integer.toBinaryString(n);
//		long lng=Long.parseLong(binery);
//		System.out.println(lng);
		long result=convertDecimalToBinary(n);
		System.out.println(result);
	}
	static long convertDecimalToBinary(int n) {
		String str="";
		while(n>0) {
			int digit=n%2;
			str=digit+str;
			n/=2;
		}
		long lng=Long.parseLong(str);
		return lng;
	}

}
