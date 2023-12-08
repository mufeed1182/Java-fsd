package com.ust.rest;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.entity.Product;
import com.ust.rest.entity.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductRepository pr;
	
	@GetMapping
	public List<Product> retriveAllProduct() {
		return pr.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id")Integer id) {
		Product pdt=null;
		Optional<Product> temp = pr.findById(id);
		if(temp.isPresent())
			pdt=temp.get();
		return pdt;
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return pr.save(product);
	}
	
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		Product pdt=findProductById(product.getId());
		if (pdt!=null)
		{
			pdt=product;
			pr.save(pdt);
		}
		return pdt;
	}
	
	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable("id")Integer id) {
		Product pdt=findProductById(id);
		if (pdt!=null)
		{
			pr.delete(pdt);
		}
		return pdt;
	}

}
