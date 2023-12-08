package week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class App_Employee2 {

	public static void main(String[] args) {
		List<Employee2> empList=new ArrayList<Employee2>();
		empList.add(new Employee2(1234,"Mufeed","Unni","AEI",25000.0));
		empList.add(new Employee2(1235,"Abin","James","CSE",30000.0));
		empList.add(new Employee2(1236,"Ajay","Aju","CSE",24000.0));
		empList.add(new Employee2(1237,"Vishnu","Kumar","ECE",26000.0));
		empList.add(new Employee2(1238,"Antu","Jilson","ECE",27000.0));
		empList.add(new Employee2(1239,"Vivek","Kumaer","ECE",25000.0));
		
		Map<String, Long> result=empList.stream()
				.collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.counting()));
		System.out.println("Counting by Department");
		for(Entry<String, Long> e:result.entrySet())
			System.out.println(e);
		
//		Map<Double, Optional<Employee2>> result1=empList.stream()
//				.collect(Collectors.minBy(getSalery));
//		System.out.println("Min value of Salery");
//		for(Entry<Double, Optional<Employee2>> e:result1.entrySet())
//			System.out.println(e);
	}

}
