package aaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.tools.javac.util.Pair;

public class FindAllPairsWithAGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Pair[] allPairs( long A[], long B[], long N, long M, long X) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(A);
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                if (A[i]*B[j]==X){
                    list.add((int)A[i]);
                    list.add((int)B[j]);
                }
            }
        }
        Pair<Integer, Integer>[] pairs = new Pair[list.size()/2];
        for (int i = 0; i < list.size(); i+=2) {
            pairs[i] = new Pair<>(list.get(i), list.get(i+1));
        }
        return pairs;
    }

}
