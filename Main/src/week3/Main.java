package week3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Strings: ");
		int n=sc.nextInt();
		char[] arr=new char[n];
		for (int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			System.out.println(str);
			
		}
		
		
	}
	

}
