package JavaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FruitSelector {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		ArrayList<String> list1=new ArrayList<>();
		for (int i=0;i<m;i++) {
			String detail1=sc.next();
			list1.add(detail1);
		}
		ArrayList<String> list2=new ArrayList<>();
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			String detail2=sc.next();
			list2.add(detail2);
		}
		System.out.println(list1);
		System.out.println(list2);
		ArrayList<String> list3=new ArrayList<>();
		for (String fruit: list1) {
			if (!fruit.endsWith("a")&& !fruit.endsWith("e")){
				list3.add(fruit);
			}
		}
		for (String fruit:list2) {
			if(!fruit.startsWith("m")&&!fruit.startsWith("a")) {
				list3.add(fruit);
			}
		}
		System.out.println(list3);

	}

}
 