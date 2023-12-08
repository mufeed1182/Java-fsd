package aaaa;

import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        int sum = 0;
        int n = 1;
        while (sum < x) {
            sum += n;
            n++;
        }

        if (sum == x) {
            System.out.println("True");
            System.out.println(n - 1);
        } else {
            int leftN = n - 2;
            //int leftSum = (leftN * (leftN + 1)) / 2;
            int rightN = n - 1;
            //int rightSum = (rightN * (rightN + 1)) / 2;

            System.out.println("False");
            //System.out.println("n1 = " + leftN + ", sum = " + leftSum);
            System.out.println(leftN+" "+rightN);
        }
    }
}