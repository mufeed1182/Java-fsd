package aaaa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestPalindromeInAString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer> list=new ArrayList<>();
	int a=2;
	list.add(2);
	while(n>0) {
		if (n==1) {
			break;
		}
		a++;
		if (isPrime(a)) {
			list.add(a);
		}
		if (list.size()==n) {
			break;
		}
	}
	System.out.println(list);
	DecimalFormat
	
	}
	private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
