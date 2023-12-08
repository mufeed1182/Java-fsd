package com.ust.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.Car;
import com.ust.spring.repository.CarRepository;

class AlreadyExist extends RuntimeException
{
	public AlreadyExist(String msg)
	{
		super(msg);
	}
}

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	private CarRepository cr;
	
	@PostMapping
	public ResponseEntity<Car> addCar(@RequestBody Car car) {
		if (car.getId()==null)
		{
			Car savedCar=cr.save(car);
			return ResponseEntity.ok(savedCar);	
		}else 
		{
			throw new AlreadyExist("Already Exist");
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Car>> retriveAllCars() {
		List<Car> cars = cr.findAll();
		return ResponseEntity.ok(cars);
//		return new ResponseEntity<>(cr.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Car> findCarsById(@PathVariable("id")Integer id) {
		Optional<Car> temp = cr.findById(id);
		Car car=null;
		if (temp.isPresent())
		{
			car=temp.get();
			return ResponseEntity.ok(car);
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Car> updateCar(@PathVariable("id")Integer id,@RequestBody Car car) {
		Optional<Car> optionalCar = cr.findById(id);
		if (optionalCar.isPresent())
		{
			Car existingCar=optionalCar.get();
			existingCar.setName(car.getName());
			existingCar.setPrice(car.getPrice());
			
			Car updatedCar=cr.save(existingCar);
			return ResponseEntity.ok(updatedCar);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Car> deleteCar(@PathVariable("id")Integer id) {
		Optional<Car> optionalCar = cr.findById(id);
		if (optionalCar.isPresent())
		{
			Car car=optionalCar.get();
			cr.delete(car);
			return ResponseEntity.ok(car);
		}else {
			return ResponseEntity.notFound().build();
		}
	}

}
