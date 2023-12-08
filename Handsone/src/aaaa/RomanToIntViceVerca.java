package aaaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanToIntViceVerca {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("1- Roman to Integer : \n"
				+ "2- Integer to Roman : "
				+ "");
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			System.out.println("Enter the Roman Letter: ");
			String roman=sc.next();
			int result=0;
			int prev=0;
			for (int i=roman.length()-1;i>=0;i--) {
				char c=roman.charAt(i);
				int current=0;
				switch(c) {
				case 'I':
					current=1;
					break;
				case 'V':
					current=5;
					break;
				case 'X':
					current=10;
					break;
				case 'L':
					current=50;
					break;
				case 'C':
					current=100;
					break;
				case 'D':
					current=500;
					break;
				case 'M':
					current=1000;
					break;
				}
				if (current<prev) {
					result-=current;
				}else {
					result+=current;
				}
				prev=current;
			}
			System.out.println("The Integer is: "+result);
			break;
		case 2:
			List<String>list=new ArrayList<>();
			String[] str= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
			int[] in= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
			int num=sc.nextInt();
			for (int i=0;i<in.length;i++) {
				while(num>=in[i]) {
					num-=in[i];
					list.add(str[i]);
				}
			}
			String romanLetter="";
			for (String a:list) {
				romanLetter+=a;
			}
			System.out.println("The Roman Letter is: "+romanLetter);
			break;
		}
		sc.close();

	}

}
