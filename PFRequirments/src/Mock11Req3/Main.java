package Mock11Req3;

import java.util.Scanner;

public class Main {
	static Boolean validateWebsite(String website) {
		if (website.matches("^(http|https)://(www\\.)?[a-zA-Z]+\\.([a-zA-Z]{2,6}|[a-zA-Z]{2,6}\\.[a-zA-Z]{2})$")) {
			return true;
		}else {
		return false;
		}
	}
	static Boolean validateMobile(String mobileNo) {
		if (mobileNo.matches("[+]{1}[91]{2}[0-9]{10}")) {
			return true;
		}else {
		return false;
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=2;
		System.out.println("1.Validate Website\r\n" + 
					"2.Validate Mobile number\r\n" + 
					"");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:				
			System.out.println("Enter the Website to be validated:");
			String website=sc.nextLine();
			if (website.equals(""))
				website=sc.nextLine();
			Boolean flag=validateWebsite(website);
			if (flag) {
				System.out.println("Website is Valid");
			}else {
				System.out.println("Website is InValid");
			}
			System.exit(0);
			break;
		case 2:
			System.out.println("Enter the MobileNumber to be validated: ");
			String mobileno=sc.nextLine();
			if (mobileno.equals(""))
				mobileno=sc.nextLine();
			Boolean flag1=validateMobile(mobileno);
			if (flag1) {
				System.out.println("Mobile Number is Valid");
			}else {
				System.out.println("Mobile Number is InValid");
			}
			System.exit(0);
			break;
		}
		
	}

}
