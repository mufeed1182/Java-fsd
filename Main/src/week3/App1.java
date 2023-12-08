package week3;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user 1 details: ");
		String detail1=sc.nextLine();
		System.out.println("Enter user 2 details: ");
		String detail2=sc.nextLine();
		
		String[] arr=detail1.split(",");
		User user1=new User();
		user1.setName(arr[0]);
		user1.setEmailId(arr[1]);
		user1.setContactNumber(arr[2]);
		
		String[] arr1=detail2.split(",");
		User user2=new User();
		user2.setName(arr1[0]);
		user2.setEmailId(arr1[1]);
		user2.setContactNumber(arr1[2]);
		
		System.out.println("User 1");
		System.out.println(user1);
		
		System.out.println("\nUser 2");
		System.out.println(user2);

		if (detail1.equals(detail2)) {
			System.out.println("\nUser 1 is same as User 2");
		}else {
			System.out.println("\nUser 1 and User 2 are different");
		}

	}

}
