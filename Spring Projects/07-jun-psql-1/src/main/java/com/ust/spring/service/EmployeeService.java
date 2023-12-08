package com.ust.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.Employee;
import com.ust.spring.repository.EmployeeRespository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRespository er;

	public Employee create(Employee employee) {
		return er.save(employee);
	}
	
	public List<Employee> read() {
		return er.findAll();
	}
	public Employee read(Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee emp=null;
		if (temp.isPresent())
		{
			emp=temp.get();
		}
		return emp;
	}
	public Employee update(Employee employee) {
		Employee emp = read(employee.getId());
		if (emp!=null)
		{
			emp=employee;
			er.save(emp);
		}
		return emp;
	}
	public Employee delete(Integer id) {
		Employee emp = read(id);
		if (emp!=null)
		{
			er.delete(emp);
		}
		return emp;
	}
	
	
}