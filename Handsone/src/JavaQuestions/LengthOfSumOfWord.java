package JavaQuestions;

import java.util.Scanner;

public class LengthOfSumOfWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		int count=0;
		if(str1[0].equals(str1[str1.length-1])) {
			count=str1[0].length();
		}else {
			count=str1[0].length()+str1[str1.length-1].length();
		}
		System.out.println(count);
		
	}

}
