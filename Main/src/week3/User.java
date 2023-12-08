package week3;

public class User {
	private String name;
	private String emailId;
	private String contactNumber;
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public User(String name, String emailId, String contactNumber) {
//		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
//		return String.format("name: %s\nemailId: %s\ncontactNumber: ", name, emailId, contactNumber );
		return "Name = " + name + "\nEmailId = " + emailId + "\nContactNumber = " + contactNumber ;
	}
	
	
	
	//return String.format("Name: %s\nEmailId: %\nContactNumber: ",name,emailId,contactNumber);
	
}
