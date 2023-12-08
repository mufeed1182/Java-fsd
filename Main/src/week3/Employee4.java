package week3;

public class Employee4 {
	private Integer id;
	private String name;
	private String department;
	private Double Salery;
	public Employee4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee4(Integer id, String name, String department, Double salery) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		Salery = salery;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalery() {
		return Salery;
	}
	public void setSalery(Double salery) {
		Salery = salery;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", department=" + department + ", Salery=" + Salery + "]";
	}
}
