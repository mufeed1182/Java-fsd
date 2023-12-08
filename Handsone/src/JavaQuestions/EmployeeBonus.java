package JavaQuestions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ids=new int[n];
		String dob[]=new String[n];
		Map<Integer, String> map1=new HashMap<>();
		Map<Integer, Integer> map2=new HashMap<>();
		TreeMap<Integer,Integer> t1=new TreeMap<Integer, Integer>();
		for (int i=0;i<n;i++) {
			int id=sc.nextInt();
			ids[i]=id;
			dob[i]=sc.next();
			int salery=sc.nextInt();
			map1.put(id, dob[i]);
			map2.put(id, salery);
		}
		String ss="01-09-2014";
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		StringTokenizer st1=new StringTokenizer(ss,"-");
		int dd = 0,mm = 0,yy = 0;
		while(st1.hasMoreTokens()) {
			dd=Integer.parseInt(st1.nextToken());
			mm=Integer.parseInt(st1.nextToken());
			yy=Integer.parseInt(st1.nextToken());
		}
		int d = 0,m = 0,y = 0, sal=0;;
		for (int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(dob[i],"-");
			while(st.hasMoreTokens()){
				d=Integer.parseInt(st.nextToken());
				m=Integer.parseInt(st.nextToken());
				y=Integer.parseInt(st.nextToken());
				}
			int age=0;
			if (d<dd||m<mm && y==yy) {
				age=(yy-y)-1;
			}else {
				age=yy-y;
			}
//			System.out.println(age);
			if (age>25&&age<=30) {
				sal=map2.get(ids[i]);
				sal=sal+sal/5;
			}else if(age>30&&age<=60) {
				sal=map2.get(ids[i]);
				sal=sal+((sal*3)/10);
			}
			t1.put(ids[i], sal);
		}
		
		for (Map.Entry<Integer, Integer> e:t1.entrySet()) {
			System.out.println(e.getKey()+"\n"+e.getValue());
		}
		
	}

}
