package JavaQuestions;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LaepYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] s1=str.split("/");
		int[] arr=new int[s1.length];
		for (int i=0;i<s1.length;i++) {
			arr[i]=Integer.valueOf(s1[i]);
		}
		boolean b=false;
		int year=0;
		for (int i=0;i<arr.length;i++) {
			year=arr[arr.length-1];
		}
		GregorianCalendar gc=new GregorianCalendar();
		b=gc.isLeapYear(year);
		System.out.println(b);
	}
}

