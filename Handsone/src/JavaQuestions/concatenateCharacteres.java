package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class concatenateCharacteres {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> str1=new ArrayList<>();
		String[] str=new String[n];
		for (int i=0;i<n;i++) {
			str[i]=sc.next();
		}
//		for (String s:str)
//		System.out.println(s);
		for (int i=0;i<str.length;i++) {
			String s1=str[i].substring(str[i].length()-1);
			str1.add(s1);
		}
		Object object=new Object();
		Object[] objects = str1.toArray();
		for (Object obj : objects)
            System.out.print(obj);

	}

}
