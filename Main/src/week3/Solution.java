package week3;

import java.util.*;

public class Solution {
    public static boolean isPrime(int num) {
        if (num <= 2) {
            return false;
        }
        if (num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int evenPrimes(int N, List<Integer> A) {
        int sum = 0;

        // Iterate through the array
        for (int num : A) {
            // Check if the number is even and has a prime factor greater than 2
            if (num % 2 == 0 && isPrime(num / 2)) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());

        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }

        int result = evenPrimes(N, A);

        System.out.println(result);
    }
}
