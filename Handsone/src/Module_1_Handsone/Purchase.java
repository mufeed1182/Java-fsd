package Module_1_Handsone;

import java.util.Date;

public class Purchase {
	private int id;
	private double price;
	private String couponCode;
	private Date purchaseDate;
	private User user;
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(int id, double price, String couponCode, Date purchaseDate, User user) {
		super();
		this.id = id;
		this.price = price;
		this.couponCode = couponCode;
		this.purchaseDate = purchaseDate;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", price=" + price + ", couponCode=" + couponCode + ", purchaseDate="
				+ purchaseDate + ", user=" + user + "]";
	}
	public void setUser(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
