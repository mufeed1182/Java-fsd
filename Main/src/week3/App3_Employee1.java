package week3;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;

public class App3_Employee1 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(1,"Mufeed","Unni",12900.0);
		Employee1 e2=new Employee1(2,"Abin","James",12300.0);
		Employee1 e3=new Employee1(3,"Ajay","Aju",14300.0);
		Employee1 e4=new Employee1(4,"Antu","Jilson",12700.0);
		List<Employee1> arr= new ArrayList<Employee1>();
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.add(e4);
		arr.stream()
		.filter(c->c.getSalary()>12700)
		.sorted((a,b)->(int) (b.getSalary()-a.getSalary()))
		.forEach(System.out::println);
//		List<Employee1> result=arr.stream()
//				.sorted((a,b)->a-b)
//				.filter(c->c >12700)
//				.collect(Collectors.toList());
		

	}

}
