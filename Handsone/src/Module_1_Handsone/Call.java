package Module_1_Handsone;

import java.util.Date;

public class Call {
	private String type;
	private String callType;
	private double cost;
	private Date duration;
	private Date date;
	private Contact contact;
	public Call() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Call(String type, String callType, double cost, Date duration, Date date, Contact contact) {
		super();
		this.type = type;
		this.callType = callType;
		this.cost = cost;
		this.duration = duration;
		this.date = date;
		this.contact = contact;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Call [type=" + type + ", callType=" + callType + ", cost=" + cost + ", duration=" + duration + ", date="
				+ date + ", contact=" + contact + "]";
	}
	
	

}
