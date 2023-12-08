package JavaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VowelsReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		List<Integer> list=new ArrayList<>();
		List<Character> list1=new ArrayList<>();
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				list.add(i);
				list1.add(str.charAt(i));
			}
		}
//		System.out.println(list);
		Collections.reverse(list1);
//		System.out.println(list1);
		char[] arr=str.toCharArray();
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<list.size();j++) {
				if (i==list.get(j)){
					arr[i]=list1.get(j);
					
				}
			}
		}
		for (char c:arr) {
			System.out.print(c);
		}

	}

}
