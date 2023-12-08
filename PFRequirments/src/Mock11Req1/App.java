package Mock11Req1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter College 1 detail: ");
		String detail1=sc.nextLine();
		System.out.println("Enter collger 2 detail: ");
		String detail2=sc.nextLine();
		
		String[] arr=detail1.split(",");
		College college1=new College();
		college1.setName(arr[0]);
		college1.setWebsite(arr[1]);
		college1.setMobile(arr[2]);
		college1.setFounder(arr[3]);
		college1.setNumberOfDept(Integer.valueOf(arr[4]));
		college1.setLocation(arr[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		college1.setStartingDate(sdf.parse(arr[6]));
		
		String[] arr1=detail2.split(",");
		College college2=new College();
		college2.setName(arr1[0]);
		college2.setWebsite(arr1[1]);
		college2.setMobile(arr1[2]);
		college2.setFounder(arr1[3]);
		college2.setNumberOfDept(Integer.valueOf(arr1[4]));
		college2.setLocation(arr1[5]);
		//SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		college2.setStartingDate(sdf.parse(arr1[6]));
		
		System.out.println("College 1:");
		System.out.println(college1);
		System.out.println("College 2: ");
		System.out.println(college2);
		String a=college1.getName().toLowerCase();
		String b=college2.getName().toLowerCase();
		if (a.equals(b)&&college1.getStartingDate().equals(college2.getStartingDate())) {
			System.out.println("College 1 is same as College 2 ");
		}else {
			System.out.println("College 1 and College 2 are different");
		}
	}

}
