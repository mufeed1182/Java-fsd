package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeAndVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] string=str.toCharArray();
		List<Character> list1=new ArrayList<>();
		List<Character> list2=new ArrayList<>();
		for (int i=0;i<string.length;i++) {
			list1.add(string[i]);
		}
		for (int i=string.length-1;i>=0;i--) {
			list2.add(string[i]);
		}
		int count=0;
		for (int i=0;i<list1.size();i++) {
		if (list1.contains('a')||list1.contains('A')||list1.contains('e')||list1.contains('E')||
				list1.contains('i')||list1.contains('I')||list1.contains('o')||list1.contains('O')||
				list1.contains('u')||list1.contains('U')) {
			count++;
			}
		}
		System.out.println(count);
		if (count>=2 &&list1.equals(list2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	
		

	}
	
		
		
	

}
