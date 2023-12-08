package JavaQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CocaCola {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] input2=new int[n];
		for (int i=0;i<n;i++) {
			input2[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] input4=new int[m];
		for (int i=0;i<m;i++) {
			input4[i]=sc.nextInt();
		}
		
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<input4.length;i++){
	        int count=0;
	        for (int j=0;j<input2.length;j++){
	            if (input4[i]>=input2[j]){
	                count++;  
	            }
	        }
	        list.add(count);
	    }
//	    int[] arr=new int[list.size()];
//	    for (int i=0;i<list.size();i++){
//	        arr[i]=list.get(i);
//	    }
	    System.out.println(list);

	}

}
