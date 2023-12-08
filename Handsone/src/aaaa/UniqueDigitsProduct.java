package aaaa;

import java.util.*;

public class UniqueDigitsProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Set<Integer> uniqueProducts = new HashSet<>();
        for (int num : arr) {
            int product = 1;
            while (num != 0) {
                product *= num % 10;
                num /= 10;
            }
            uniqueProducts.add(product);
        }

        System.out.println(uniqueProducts.size());
    }
}
