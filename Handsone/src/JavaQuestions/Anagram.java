package JavaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String s1=str1.toLowerCase().replaceAll(" ", "");
		String s2=str2.toLowerCase().replaceAll(" ", "");
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		List<Character> list1=new ArrayList<>();
		for (int i=0;i<arr1.length;i++) {
			list1.add(arr1[i]);
		}
		List<Character> list2=new ArrayList<>();
		for (int i=0;i<arr2.length;i++) {
			list2.add(arr2[i]);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if (list1.equals(list2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
		

	}

}
