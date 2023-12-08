package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//char[] s1=str.toCharArray();
//		int[] arr=new int[str.length()];
		//List<Character> list=new ArrayList<>();
		int total=0;
		for (int i=0;i<str.length();i++) {
			int sum=0;
			if (Character.isDigit(str.charAt(i))) {
				sum+=Character.getNumericValue(str.charAt(i));
			}
			total+=sum;
			
		}
		if (total>0) {
			System.out.println(total);
		}else {
			System.out.println("-1");
		}
		
		//System.out.println(list);
	}

}
