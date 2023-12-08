package Module_1_Handsone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of purchases: ");
		int noOfPurchases=sc.nextInt();
		List<User> userList=User.prefill();
		List<Purchase> purchaseList=new ArrayList<>();
		for (int i=0;i<noOfPurchases;i++) {
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr=detail.split(",");
			Purchase purchase=new Purchase();
			purchase.setId(Integer.valueOf(arr[0]));
			purchase.setPrice(Integer.valueOf(arr[1]));
			purchase.setCouponCode(arr[2]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			purchase.setPurchaseDate(sdf.parse(arr[3]));
			String userName=arr[4];
			for(User u:userList) {
				if (u.getName().equals(userName)) {
					purchase.setUser(u);
					u.getPurchaseList().add(purchase);
				}
			}
			purchaseList.add(purchase);
			
		}
		System.out.println("Enter the month: ");
		String month=sc.nextLine();
		User result=User.getValuableUser(userList, month);
		System.out.println("The valuable user of the month "+month+"is "+result.getName());

	}

}
