package com.belentpatrus.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.belentpatrus.app.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

}
