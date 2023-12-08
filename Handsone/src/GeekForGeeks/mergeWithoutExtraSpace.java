package GeekForGeeks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class mergeWithoutExtraSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr1=new long[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextLong();
		}
		int m=sc.nextInt();
		long[] arr2=new long[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextLong();
		}
//		Set<Long> set=new TreeSet<>();
//        for(int i=0;i<n;i++) {
//       	 set.add(arr1[i]);
//        }
//        for(int i=0;i<m;i++) {
//       	 set.add(arr2[i]);
//        }
        long[] arr=new long[m+n];
        int j=0;
        for(int i=0;i<n;i++) {
        	arr[j]=arr1[i];
        	j++;
        }
        for(int i=0;i<m;i++) {
        	arr[j]=arr2[i];
        	j++;
        }
        Arrays.sort(arr);
        for( long a:arr)
        System.out.print(a);

	}
//	public static void merge(long arr1[], long arr2[], int n, int m) 
//    {
//         
//         
//    }

}
