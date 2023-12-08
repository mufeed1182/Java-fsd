package com.ust.spring.controller;

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

import com.ust.spring.entity.Product;
import com.ust.spring.repository.ProductRepository;

class productAlreadyExistException extends RuntimeException
{
	public productAlreadyExistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductRepository pr;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		System.out.println(product);
		if (product.getId()==null)
		{
			return pr.save(product);
		}
		Product temp = findByProductId(product.getId());
		if (temp==null)
		{
			pr.save(product);
		}else
		{
			throw new productAlreadyExistException("product with ID:"+product.getId()+"already exist");
		}
		return pr.save(product);
	}
	
	@GetMapping("/{id}")
	public Product findByProductId(@PathVariable("id")Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product pdt=null;
		if (temp.isPresent()) {
			pdt=temp.get();
		}
		return pdt;
	}
	@GetMapping
	public List<Product> retrieveAllProducts() {
		return pr.findAll();
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id")Integer id,@RequestBody Product product) {
		Product temp = findByProductId(id);
		if (temp!=null)
		{
			temp=product;
			pr.save(temp);
		}
		return temp;
	}
	
	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable("id")Integer id) {
		Product temp = findByProductId(id);
		if (temp!=null)
		{
			pr.delete(temp);
		}
		return temp;
	}

}
