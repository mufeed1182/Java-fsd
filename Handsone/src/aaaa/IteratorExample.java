package aaaa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IteratorExample {
    public static void main(String[] args) {
 
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//
//        // Get an iterator for the list
//        Iterator<String> it = fruits.iterator();
//
//        // Iterate through the elements using the iterator
//        while (it.hasNext()) {
//            String fruit = it.next();
//            System.out.println(fruit);
//        }
    	StringTokenizer st=new StringTokenizer(str,"");
    	while(st.hasMoreElements()) {
    		String s=st.nextToken();
    		System.out.println(s);
    	}
    }
}
