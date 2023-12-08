package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App_Employee4 {

	public static void main(String[] args) {
		List<Employee4> empList=new ArrayList<Employee4>();
		empList.add(new Employee4(1234,"Mufeed","AEI",25000.0));
		empList.add(new Employee4(1235,"Abin","CSE",30000.0));
		empList.add(new Employee4(1236,"Ajay","CSE",24000.0));
		empList.add(new Employee4(1237,"Vishnu","ECE",26000.0));
		empList.add(new Employee4(1238,"Antu","ECE",27000.0));
		empList.add(new Employee4(1239,"Vivek","ECE",25000.0));
		
		Map<String, Double> result=empList.stream()
				.collect(Collectors.groupingBy(Employee4::getDepartment,Collectors.averagingDouble(Employee4::getSalery)));
		
		for(Entry<String, Double> e:result.entrySet())
			System.out.println(e);

	}

}
