package JavaQuestions;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0) {
			System.out.println("Invalid input only odd number");
			System.exit(0);
		}
		int[] arr=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int first=arr[0];
		int mid=arr[(n-1)/2];
		int last=arr[n-1];
		if(first >= mid && first >= last) {
	        System.out.println(first);
	    }
	    else if(mid >= first && mid >= last) {
	        System.out.println(mid);
	    }
	    else {
	        System.out.println(last);
	    }
			
	}

}
