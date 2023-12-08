package aaaa;
	
	import java.io.*;
	import java.util.*;
	import java.lang.Math;
	public class MostSpecialNumber {
	    public static List<Integer> MostSpecialNumber(int n,int[] arr){
	        Arrays.sort(arr);
	        List<Integer> list=new ArrayList<>();
//	        int m=0;
	        int count1=0;
	        for (int i=0;i<n;i++){
	        	int s=arr[i];
	            int count=0;
	            List<Integer> list1=new ArrayList<>();
	            while(arr[i]>0){
	                int digit=arr[i]%10;
	                if (!list1.contains(digit)) {
	                	count++;
	                }
	                list1.add(digit);
	                arr[i]/=10;
	            }
	            list1.clear();
//	            list.add(count);
//	            list.add(s);
	            if (count>=count1){
	            	list.clear();
	                list.add(s);
	                count1=count;
	            }
	            
	        }
	        return list;

	    }

	    public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        int n;
	        n=scan.nextInt();
	        int[] arr = new int[n];
	        for(int j=0;j<n;j++){
	            arr[j]=scan.nextInt();
	        }
	        List<Integer> list1 = MostSpecialNumber(n,arr);
	        for (int a:list1)
	        	System.out.println(a);
	        return ;
	    }
	}

