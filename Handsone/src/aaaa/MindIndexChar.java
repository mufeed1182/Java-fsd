package aaaa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MindIndexChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String patt=sc.next();
//		Map<Character, Integer> map=minIndexChar(str, patt);
//		for (Map.Entry<Character, Integer> e:map.entrySet()) {
//			System.out.println(e.getKey()+"  "+e.getValue());
//		}
		int a=minIndexChar(str, patt);
		System.out.println(a);

	}
	public static int minIndexChar(String str, String patt)
    {
        Map<Character,Integer>map=new TreeMap<>();
        for (int i=0;i<patt.length();i++){
            for (int j=0;j<str.length();j++) {
            	if (!map.containsKey(patt.charAt(i))) {
            		if (patt.charAt(i)==str.charAt(j)) {
            			map.put(patt.charAt(i), j);
            	}
            	}
            }
        }
        int lowestValue = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if (value < lowestValue) {
                lowestValue = value;
            }
        }
//        Map.Entry<Character, Integer> firstEntry = ((TreeMap<Character, Integer>) map).firstEntry();
//        int a = firstEntry.getValue();
        return lowestValue;
    }

}
