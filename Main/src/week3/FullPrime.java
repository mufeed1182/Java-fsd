package week3;

import java.util.Scanner;
public class FullPrime {

	public static boolean isPrime(int num) {
		
		if(num<2)
			return false;

		for(int i=2;i<=num/2;i++)
		{

			if(num%i==0)

				return false;
			}
		return true;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int from=sc.nextInt();
		int to=sc.nextInt();
		boolean flag=true;
		outer:
			for(int i=from;i<=to;i++)
			{
				if(isPrime(i))
				{
					String str=String.valueOf(i);
					char[] arr = str.toCharArray();
					inner:
						for(char c : arr)
						{
							int digit=c-48;
							if(!isPrime(digit))
							{
								flag=false;
								continue outer;

							}
							}
					System.out.println(i);
					}
				}
		if(flag==true)
		{
		
			System.out.println("-1");
			
		}
		}
	
	
	}