package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;


public class Solution1 {
    
	public static int buggyCountNonOverlappingSubstringOccurrences(String str, String t) {
        // Fix the code here
        if (t.isEmpty()) {
            return 0;
        }

        int count = 0;
        int start = 0;
        while ((start = str.indexOf(t, start)) != -1) {
            count++;
            
            start += 1;
            return start;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String str = scan.nextLine();
        
        String t = scan.nextLine();
    
        int result = buggyCountNonOverlappingSubstringOccurrences(str, t);
    
        System.out.println(result);
    }
}
