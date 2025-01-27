package com.belentpatrus.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belentpatrus.app.Repository.FoodRepository;
import com.belentpatrus.app.model.Food;

@Service
public class FoodService {

	@Autowired
	private FoodRepository repo;
	
	public List<Food> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Food save(Food food) {
		// TODO Auto-generated method stub
		return repo.save(food);
	}

	
	

}
