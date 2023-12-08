package JavaQuestions;

import java.util.ArrayList;

public class UserMainCode {
	public static int[] arrayListSubstractor(ArrayList<Integer> arr1,ArrayList<Integer> arr2) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.addAll(arr1);
		arr.removeAll(arr2);
		arr2.removeAll(arr1);
		arr.addAll(arr2);
		int[] arr3=new int[arr.size()];
		for (int i=0;i<arr.size();i++) {
			arr3[i]=arr.get(i);
		}
		return arr3;
	}

}
