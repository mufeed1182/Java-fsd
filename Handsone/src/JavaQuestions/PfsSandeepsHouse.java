package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PfsSandeepsHouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		int a=0;
		int b=1;
		list.add(0);
		list.add(1);
		while(n>0) {
			int c=a+b;
			list.add(c);
			a=b;
			b=c;
			int count=1;
			while(c>9){
				c/=10;
				count++;
			}
			if (count==n) {
				break;
			}
		}
		System.out.println(list.size()-1);
		}

	}
 