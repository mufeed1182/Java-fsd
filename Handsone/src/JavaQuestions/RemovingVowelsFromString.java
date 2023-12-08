package JavaQuestions;

import java.util.Scanner;

public class RemovingVowelsFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		StringBuffer sb=new StringBuffer();
		for (int i=0;i<s1.length();i++) {
			if ((i%2)==0) {
				sb.append(s1.charAt(i));
			}else if((i%2)!=0) {
				if (s1.charAt(i)!='a'&&s1.charAt(i)!='e'&&s1.charAt(i)!='i'&&s1.charAt(i)!='o'&&s1.charAt(i)!='u'&&
						s1.charAt(i)!='A'&&s1.charAt(i)!='E'&&s1.charAt(i)!='I'&&s1.charAt(i)!='O'&&s1.charAt(i)!='U') {
						sb.append(s1.charAt(i));	
				}
			}
		}
		System.out.println(sb.toString());
	}

}
