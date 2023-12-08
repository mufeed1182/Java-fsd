package aaaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ChessBoard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the no of row: ");
		int r=sc.nextInt();
		System.out.println("Enter the no of colomns: ");
		int c=sc.nextInt();
		int first[][]=new int[r][c];
		System.out.println("Enter the elements of the matrix : ");
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                first[i][j] = sc.nextInt();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
             System.out.print(first[i][j] + "  ");
			System.out.println();
			
			}
		
		List<Integer> arr1=new ArrayList<>();
		List<Integer> arr2=new ArrayList<>();
		//boolean flag=false;
		for(int i=0;i<r;i++) {
			for (int j=0;j<c;j++) {
				if (first[i][j]==0) {
					arr1.add(first[i][j]);
					j+=2;
				}else if(first[i][j]==1) {
					arr2.add(first[i][j]);
					j+=2;
				}	
			}
		}
	
		System.out.println(arr1.size());
		System.out.println(arr2);
		
		
//		if(arr1.contains(1)){
//			System.out.println("false");
//		}
//		if(arr2.contains(0)) {
//			System.out.println("False");
//		}
		
		
		
		

	}

}
 