package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterOrSumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();
		for (int i=0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))){
				list1.add(str.charAt(i));
			}else if(Character.isAlphabetic(str.charAt(i))) {
				list2.add(str.charAt(i));
				}
			}
		
	}

}
