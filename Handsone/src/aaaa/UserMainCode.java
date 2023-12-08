package aaaa;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {
	public static String[] convertToStringArray(ArrayList<String> arr){
		Collections.sort(arr);
		String[] arr1 = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
		    arr1[i] = arr.get(i);
		}
		return arr1;
	}
		
	}


