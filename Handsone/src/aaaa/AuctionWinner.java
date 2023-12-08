package aaaa;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class AuctionWinner {
    public static int auction(int[] bids){
        int n=bids.length;
        Map<Integer,Integer> map=new TreeMap<>();
        for (Integer element : bids) {
            if (map.containsKey(element)) {
                int count = map.get(element);
                map.put(element, count + 1);
            } else {
                map.put(element, 1);
            }
        }
        int lowest=Integer.MAX_VALUE;
        int num=-1;
        for (int i=0;i<n;i++) {
        	if (map.get(bids[i])==1 && bids[i]<lowest) {
        		lowest=bids[i];
        		num=i+1;
        	}
        }
        
        return num;
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] bids = new int[N];
        for(int j=0;j<N;j++){
            bids[j]=scan.nextInt();
        }
        int result;
        result = auction(bids);
        System.out.print(result);
//        Map<Integer,Integer> map = auction(bids);
//        for (Map.Entry<Integer, Integer> a:map.entrySet()) {
//        	System.out.println(a.getKey()+" "+a.getValue());
//        }
        return ;
    }
}