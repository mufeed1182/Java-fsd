package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


}
