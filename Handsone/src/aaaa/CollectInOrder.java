package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class CollectInOrder {
    public static int minTurns(int N,int[] Perm){
    	int[] visited = new int[N];
        Arrays.fill(visited, -1);

        int count = 0;
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int current = Perm[left];
            if (visited[current - 1] == -1) {
                visited[current - 1] = count;
                left++;
            } else {
                int index = visited[current - 1];
                if (index % 2 == 0) {
                    right--;
                } else {
                    left++;
                }
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] Perm = new int[N];
        for(int j=0;j<N;j++){
            Perm[j]=scan.nextInt();
        }
        int result;
        result = minTurns(N,Perm);
        System.out.print(result);
        return ;
    }
}
