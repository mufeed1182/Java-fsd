package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInAGIvenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine(); 
//		System.out.println(S);
		String result=reverseWords(S);
		System.out.println(result);

	}
	static String reverseWords(String S)
    {
        String[] s1=S.split("[.]");
        List<String>list=new ArrayList<>();
        for (int i=0;i<s1.length;i++){
            list.add(s1[s1.length-i-1]);
            list.add(".");
        }
        list.remove(list.size()-1);
        String a="";
        for (String b:list){
            a+=b;
        }
        return a;
    }

}
