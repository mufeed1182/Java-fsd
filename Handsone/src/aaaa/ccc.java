package aaaa;

import java.util.Scanner;

public class ccc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int result=abcd(str);
		System.out.println(result);

	}
	public static int abcd(String input1) {
		String[] str=input1.split(" ");
	    int sum=0;
	    for (int i=0;i<str.length;i++){
	        String s=str[i];
	        int count=0;
	        for (int j=1;j<s.length();j++){
	            int a=(int)s.charAt(j-1);
	            int b=(int)s.charAt(j);
	            if(b>=a){
	                count++;
	            }
	        }
	        if (count==s.length()-1){
	            sum+=1;
	        }
	    }
	    return sum;
	} 

}
