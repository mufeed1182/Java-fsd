package week3;

import java.util.Scanner;

public class Prime_num {
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
	public static boolean isSmoothPrime(int n) {
		
        boolean numPlusOne = isPrime(n+1);
        boolean numMinuseOne = isPrime(n-1);
        
        if (numPlusOne && numMinuseOne) {
            return true;
        } else {
            return false;
        }
    }

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        if (isSmoothPrime(n)) {
            System.out.println("True");
            System.out.println((n-1)+" "+(n+1));
        } else {
            System.out.println("False");
        }
    }
}
