package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementsInArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		ArrayList<Integer> list1=new ArrayList<>();
		for (int i=0;i<m;i++) {
			list1.add(sc.nextInt());
		}
		int n=sc.nextInt();
		ArrayList<Integer> list2=new ArrayList<>();
		for (int i=0;i<n;i++) {
			list2.add(sc.nextInt());
		}
//		List<Integer> list3=new ArrayList<>();
//		list3.addAll(list1);
//		list3.removeAll(list2);
//		list2.removeAll(list1);
//		list3.addAll(list2);
//		//System.out.println(list3);
//		Object[] arr=list3.toArray();
//		for (Object o:arr) {
//			System.out.println(o);
//		}
		UserMainCode umc=new UserMainCode();
		int[] arr=umc.arrayListSubstractor(list1, list2);
		for (int o:arr)
			System.out.println(o);
	}

}
