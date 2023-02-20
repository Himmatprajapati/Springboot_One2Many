package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.orderdto;
import com.example.demo.model.customer;
import com.example.demo.repository.customerrepository;
import com.example.demo.repository.productrepository;




@RestController
public class order {

	@Autowired
	 private customerrepository customerrepository;

	@Autowired
	 private productrepository productrepository;
	
	@PostMapping("/senddata")
	 public customer himmat(@RequestBody orderdto request) {
		return	customerrepository.save(request.getCustomer());
	}
	
	@GetMapping("/getdata")
	 public List<customer>hp(){
		
		return customerrepository.findAll();
	}
}
