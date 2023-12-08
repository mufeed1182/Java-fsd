package GeekForGeeks;


import java.util.Arrays;
import java.util.Scanner;


public class sevenSegmentDisplay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		
		String result=sevenSegments(S, N);
		System.out.println(result);

	}
	
	static String sevenSegments(String S, int N) {
		int[] arr= {6,2,5,5,4,5,6,3,7,5};
        int sum=0;
        for(int i=0;i<N;i++) {
        	int j=S.charAt(i)-'0';
        	sum+=arr[j];
        }
        System.out.println(sum);
        int[] arr1=new int[N];
        Arrays.fill(arr1, 2);
        sum-=N*2;
//        System.out.println(sum);
        int i1=0;
        while(sum>=4 && i1<N) {
        	arr1[i1]+=4;
        	sum-=4;
        	i1++;
        }
        
        int j=N-1;
//        System.out.println(j);
        while(sum>0&&j>=0) {
        	int req=7-arr1[j];
        	req=Math.min(req, sum);
        	arr1[j]+=req;
        	sum-=req;
        	j--;
        }
        String str="";
        for(int i=0;i<N;i++) {
        	if(arr1[i]==6) str+=0;
        	else if(arr1[i]==2) str+=1;
        	else if(arr1[i]==5) str+=2;
        	else if(arr1[i]==4) str+=4;
        	else if(arr1[i]==3) str+=7;
        	else str+=8;
        }
        return str;
    }

}
