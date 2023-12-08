package Mock11Req6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges: ");
		int n=sc.nextInt();
		List<College> list=new ArrayList<>();
		for (int i=0;i<n;i++) {
			String detail=sc.nextLine();
			if (detail.equals(""))
				detail=sc.nextLine();
			String[] arr=detail.split(",");
			College college=new College();
			college.setName(arr[0]);
			college.setWebsite(arr[1]);
			college.setMobile(arr[2]);
			college.setFounder(arr[3]);
			college.setNumberOfDept(Integer.valueOf(arr[4]));
			college.setLocation(arr[5]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			college.setStartingDate(sdf.parse(arr[6]));
			list.add(college);
		}
		Map<String, Integer> map=College.calculateLocationCount(list);
		System.out.format("%-15s %s\n","Location","Count");
		for (Map.Entry<String, Integer> e:map.entrySet()) {
			
			System.out.format("%-15s %s\n", e.getKey(),e.getValue());
		}

	}

}
