package JavaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class IpValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] string=str.split("[.]");
		int[] arr = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			if (string[i].length()==3) {
            arr[i] = Integer.valueOf(string[i]);
			}else {
				System.out.println("Invalid");
				System.exit(0);
			}
		}
		boolean flag=false;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>=0 && arr[i] <= 255  ) {
				flag=true;
			}else {
				flag=false;
			}
		}
		if (flag==true) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		

	}

}
