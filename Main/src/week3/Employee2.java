package week3;

public class Employee2 {
	private Integer id;
	private String firstName;
	private String lastName;
	private String department;
	private Double salery;
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(Integer id, String firstName, String lastName, String department, Double salery) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salery = salery;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalery() {
		return salery;
	}
	public void setSalery(Double salery) {
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", salery=" + salery + "]";
	}
	
	
	

}
