package com.belentpatrus.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.belentpatrus.app.Service.FoodService;
import com.belentpatrus.app.model.Food;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class FoodController {
	
	@Autowired
	private FoodService service;
	
	@GetMapping("/foods")
	public List<Food> findAll() {
		return service.findAll();
	}
	
	@PostMapping("/food")
	public Food save(@RequestBody Food food) {
		//TODO: process POST request
		
		return service.save(food);
	}
	
	
	

}
