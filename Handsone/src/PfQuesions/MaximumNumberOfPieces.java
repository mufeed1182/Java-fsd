package PfQuesions;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0, sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
            if (sum <= x) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

