package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ch=sc.next();
		char[] ch1=ch.toCharArray();
		StringBuffer sb=new StringBuffer(str);
			sb.reverse();
		List<Character> arr=new ArrayList<>();
		for(int i=0;i<sb.length();i++) {
			arr.add(sb.charAt(i));
			arr.add(ch1[0]);
		}
		arr.remove(arr.size()-1);
		String rev="";
		for (char c:arr) {
			rev+=c;
		}
		System.out.println(rev);
//		String rev="";
//		StringTokenizer st=new StringTokenizer(sb1,"");
//		while(st.hasMoreTokens()) {
//			rev+=st.hasMoreElements();
//		}
//		System.out.println(rev);
		
	}
}
