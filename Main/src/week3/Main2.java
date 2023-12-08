package week3;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		char[] ch = a.toCharArray();
		for (int i = 0; i < a.length(); i++)
		{
			for (int j = i + 1; j < a.length(); j++)
			{
				if (ch[i] == ch[j])
				{
					System.out.println(ch[i]);
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	}

}