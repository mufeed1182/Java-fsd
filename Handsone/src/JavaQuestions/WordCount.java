package JavaQuestions;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for (int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		int m=sc.nextInt();
		int sum=0;
		for (int i=0;i<n;i++) {
			if (str[i].length()==m) {
				sum++;
			}
		}
		System.out.println(sum);

	}

}
