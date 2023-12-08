package Mock11Req3;

public class Mobile {
	private String mobile;
	private String website;
	
	public Mobile() {}
	public Mobile(String mobile,String website) {
		this.mobile=mobile;
		this.website=website;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website=website;
	}
	
}
