package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;


public class PyramidSum {
    public static List<Integer> pyramidSum(int array_length, List<Integer> arr) {
    	List<Integer>list=new ArrayList<>();
    	list.addAll(arr);
    	List<Integer>list1=new ArrayList<>();
    	int i=1;
    	int N=arr.size();
    	while(N>1)
    	{
    		if (i==N) {
    			list.clear();
    			list.addAll(list1);
    			list1.clear();
    			N--;
    			i=1;
    		}
    		list1.add(list.get(i-1)+list.get(i));
    		i++;
    	}
		return list;
        
    
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int array_length = Integer.parseInt(scan.nextLine().trim());
        
        List<Integer> arr = new ArrayList<>(array_length);
        for(int j=0; j<array_length; j++) {
            arr.add(Integer.parseInt(scan.nextLine().trim()));
        }
    
        List<Integer> result = pyramidSum(array_length, arr);
    
        System.out.println(result);
    }
}