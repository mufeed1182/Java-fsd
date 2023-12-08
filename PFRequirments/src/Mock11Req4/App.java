package Mock11Req4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number of Colleges: ");
		int n=sc.nextInt();
		List<College> list=new ArrayList<>();
		List<College> collegeList=new ArrayList<>();
		for (int i=0;i<n;i++) {
			String detail=sc.nextLine();
			if (detail.equals(""))
				detail=sc.nextLine();
			College college=College.createCollege(detail);
			collegeList.add(college);
			
		}
		int choice=3;
			System.out.println("Enter a search type:\r\n" + 
					"1.By name\r\n" + 
					"2.By starting date\r\n" + 
					"3.By location\r\n" + 
					"");
			choice=sc.nextInt();
			if (choice>3) {
				System.out.println("Invalid Choice");
			}
			switch(choice)
			{
			case 1:
				System.out.println("Enter the number of names: ");
				int m=sc.nextInt();
				List<String> nameList=new ArrayList<>();
				for (int i=0;i<m;i++) {
					String a=sc.nextLine();
					if (a.equals(""))
						a=sc.nextLine();
					nameList.add(a);
				}
				//CollegeBo b=new CollegeBo();
				list=CollegeBo.findCollege(collegeList, nameList);
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				if (list.size()==0) {
					System.out.println("No such college is presnt");
				}else {
				
				for (College c:list) {
					System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
					System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
				}
				}
				break;
			case 2:
				SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
				System.out.println("Enter the starting date:");
				String date=sc.nextLine();
				if(date.equals(""))
					date=sc.nextLine();
				Date date1=sdf1.parse(date);
				list=CollegeBo.findCollege(collegeList, date1);
				if (list.size()==0) {
					System.out.println("No such College is present");
				}else {
					for (College c:list) {
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf1.format(c.getStartingDate()));
					}
				}
				
				break;
			case 3:
				SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy");
				System.out.println("Enetr the location: ");
				String location=sc.next();
				list=CollegeBo.findCollege(collegeList, location);
				if (list.size()==0) {
					System.out.println("No such College is present");
				}else {
					for (College c:list) {
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
						System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n",c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf2.format(c.getStartingDate()));
					}
				}
				break;
			}

	}

}
