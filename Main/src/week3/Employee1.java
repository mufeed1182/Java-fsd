package week3;

public class Employee1 {
	private Integer id;
	private String firstName;
	private String lastName;
	private Double salary;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(Integer id, String firstName, String lastName, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
//	public Object compareTo(Employee1 a) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
