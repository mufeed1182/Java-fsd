package JavaQuestions;

import java.util.Scanner;

public class OddDigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for (int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for (int j=0;j<str[i].length();j++) {
				if (Character.isDigit(str[i].charAt(j))&&str[i].charAt(j)%2!=0) {
					sum+=Character.getNumericValue(str[i].charAt(j));
				}
			}
		}
		System.out.println(sum);

	}

}
