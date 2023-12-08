package com.ust.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.entity.Department;
import com.ust.rest.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService ds;
	
	@GetMapping
	public List<Department> retrieveAllDepartment() {
		return ds.read();
	}
	
	@GetMapping("/{id}")
	public Department fidnById(@PathVariable("id") Integer id) {
		Department d=ds.read(id);
		return d;
	}
	
	@PostMapping
	public Department addDepartment(@RequestBody Department department) {
		return ds.create(department);
	}
	
	@PutMapping
	public Department updateDepartment(@RequestBody Department department) {
		return ds.update(department);
	}
	
	@DeleteMapping("/{id}")
	public Department deleteDepartment(@PathVariable("id") Integer id) {
		return ds.delete(id);
	}
}
