package aaaa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SumOfRownAndColoumns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter the no of coloumns");
		int c=sc.nextInt();
		int first[][]=new int[r][c];
		Set<Integer> set=new TreeSet<>();
		Set<Integer> set1=new TreeSet<>();
		System.out.println("Enter the elements of the matrix : ");
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                first[i][j] = sc.nextInt();
		}
		
		
		System.out.println("Elements of the matrix are");
		
		
		for (int i = 0; i < r; i++) {
			int colomn=0;
			int row=0;
			for (int j = 0; j < c; j++) {
//             System.out.print(first[i][j] + "  ");
//             System.out.println();
				row+=first[i][j];
				colomn+=first[j][i];
			}
			
			
			set.add(row);
			set1.add(colomn);
     }
		
		System.out.println(set);
		System.out.println(set1);
		

	}
}
