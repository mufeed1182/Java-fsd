package JavaQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result=getVowels(str);
		System.out.println(result);

	}
	static String getVowels(String n) {
		String s=n.toLowerCase();
		char[] str=s.toCharArray();
		Set<Character> list=new HashSet<>();
		for (int i=0;i<str.length;i++) {
			for (int j=0;j<str.length;j++) {
				if (str[i]!=str[j] && (str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')) {
					list.add(str[i]);
				}
				}
			}
		if (list.size()==5) {
			return "Yes";
		}else {
			return "No";
		}
	}
}
 