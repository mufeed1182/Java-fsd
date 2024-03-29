package Mock11Req2;

import java.text.ParseException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the University: ");
		String universityName=sc.nextLine();
		University university=new University();
		university.setName(universityName);
		
		int choice=4;
		do 
		{
			System.out.println("1.Add College \r\n" + 
					"2.Delete College \r\n" + 
					"3.Display Colleges \r\n" + 
					"4.Exit \r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				String detail=sc.nextLine();
				if (detail.equals(""))
					detail=sc.nextLine();
				College college=College.createCollege(detail);
				university.addCollegeToUniversity(college);
				System.out.println("College successfully added");
				break;
			case 2:
				System.out.println("Enter the name of the college to be deleted:");
				String name=sc.nextLine();
				if (name.equals(""))
					name=sc.nextLine();
				Boolean status=university.removeCollege(name);
				if(status) {
					System.out.println("College successfully deleted");
				}else {
					System.out.println("College not found in the University");
				}
				break;
			case 3:
				university.displayColleges();
				break;
			case 4:
				System.exit(0);
			}
		}while(choice<4);
	}

}
