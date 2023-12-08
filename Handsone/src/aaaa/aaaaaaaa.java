package aaaa;

import java.util.Scanner;

public class aaaaaaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.print("Enter the number of values to print: ");
        int n = scanner.nextInt();

        printValuesWithinLimit(arr, lowerLimit, upperLimit, n);
    }

    public static void printValuesWithinLimit(int[] arr, int lowerLimit, int upperLimit, int n) {
        int count = 0;
        for (int i = 0; i < arr.length && count < n; i++) {
            if (arr[i] >= lowerLimit && arr[i] <= upperLimit) {
                System.out.println(arr[i]);
                count++;
            }
        }
    }
}
