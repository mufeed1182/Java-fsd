package week3;

import java.util.Scanner;

public class Main1

{

	public static void main(String[] args)

	{

		int count = 1;

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++)

		{

			for (int j = 0; j < i; j++)

			{

				System.out.print(count + " ");

				count++;

			}

			System.out.print("\n");

		}

	}

}