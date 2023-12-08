package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class threeDivisors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
		int q=sc.nextInt();
		ArrayList<Long> query=new ArrayList<>();
		for(int i=0;i<q;i++) {
			query.add(sc.nextLong());
		}
		ArrayList<Integer> list=threeDivisors(query, q);
		for(int d:list) {
			System.out.println(d);
		}

	}
	
	static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<q;j++) {
        	int count=0;
        	for(int i=0;i<query.get(j);i++){
        		
                if(isSquareRootPrime(i)){
                    count++;
                }
            }
        	list.add(count);
        }
        return list;
        
    }
    
	private static boolean isPrime(int n) {
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

    private static boolean isSquareRootPrime(int number) {
        int squareRoot = (int) Math.sqrt(number);
        if (squareRoot * squareRoot == number) {
            return isPrime(squareRoot);
        } else {
            return false;
        }
    }

}
