package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class MatrixRotation1 {
    public static List<List<Integer>> findMatrix(int N, List<List<Integer>> A) {
    	List<List<Integer>> list=new ArrayList<>();
    	list.addAll(A);
    	for(int i=0;i<N;i++) {
			for (int j=0;j<N;j++) {
				if (A.get(i).get(j).equals(1)) {
					list.get(Math.abs(i-(N-1))).set(j, 1);
					list.get(Math.abs(i-(N-1))).set(Math.abs(j-(N-1)), 1);
					list.get(i).set(Math.abs(j-(N-1)), 1);					
//					arr1[Math.abs(i-(n-1))][j]=1;
//					arr1[Math.abs(i-(n-1))][Math.abs(j-(n-1))]=1;
//					arr1[i][Math.abs(j-(n-1))]=1;
				}
			}
		}
        return list;
    
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int N = Integer.parseInt(scan.nextLine().trim());
        
        List<List<Integer>> A = new ArrayList<>(N);
        for(int i=0; i<N; i++) {
            A.add(
                Arrays.asList(scan.nextLine().trim().split(" "))
                .stream().map(s -> Integer.parseInt(s)).collect(toList())
            );
        }
    
        List<List<Integer>> result = findMatrix(N, A);
    
        for(int i=0; i<result.size(); i++) {
            for (int j=0; j<result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j));
                if (j < result.get(i).size() - 1) System.out.print(" ");    
            }
            System.out.println();
        }
    }
}


//List<List<Integer>> list=new ArrayList<>();
//list.addAll(A);
//for(int i=0;i<N;i++) {
//	for (int j=0;j<N;j++) {
//		if (A.get(i).get(j).equals(1)) {
//			list.get(Math.abs(i-(N-1))).set(j, 1);
//			list.get(Math.abs(i-(N-1))).set(Math.abs(j-(N-1)), 1);
//			list.get(i).set(Math.abs(j-(N-1)), 1);					
//		}
//	}
//}
//return list;