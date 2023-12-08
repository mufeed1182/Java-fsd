package com.ust.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.spring.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

}
