package com.ust.spring.controller;

import java.nio.file.Path;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.entity.Customer;
import com.ust.spring.repository.CustomerRepository;

class customerAlreadyExistException extends RuntimeException
{
	public customerAlreadyExistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository cr;
	
	@PostMapping
	public Customer addCostomer(@RequestBody Customer customer) {
		System.out.println(customer);
		if (customer.getId()==null)
		{
			System.out.println("Hello here");
			return cr.save(customer);
		}
		Customer temp = findByCustomerId(customer.getId());
		if (temp==null)
		{
			cr.save(customer);
		}else
		{
			throw new customerAlreadyExistException("Customer with ID:"+customer.getId()+"Already exists");
		}
		return customer;
	}
	
	@GetMapping
	public List<Customer> retriveAllCustomers() {
		return cr.findAll();
	}
	
	@GetMapping("/{id}")
	public Customer findByCustomerId(@PathVariable("id")Integer id) {
		Optional<Customer> temp = cr.findById(id);
		Customer cmr=null;
		if(temp!=null)
		{
			cmr=temp.get();
		}
		return cmr;
	}
	
	@PutMapping("/{id}")
	public Customer updateCutomer(@PathVariable("id")Integer id,@RequestBody Customer customer) {
		Customer temp = findByCustomerId(id);
		if (temp!=null)
		{
			temp=customer;
			cr.save(temp);
		}
		return temp;
	}
	
	@DeleteMapping("/{id}")
	public Customer deleteCustomer(@PathVariable("id")Integer id) {
		Customer temp = findByCustomerId(id);
		if (temp!=null)
		{
			cr.delete(temp);
		}
		return temp;
	}
}
