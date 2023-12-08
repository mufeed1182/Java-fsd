package week3;

import java.sql.Date;

class InvalidDateOfBirthException extends Exception
{
	public InvalidDateOfBirthException(String errormsg)
	{
		super(errormsg);
	}
}

public class Employee {
	
	private int id;
	private String name;
	private Date dob;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}

