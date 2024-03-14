package com.example.FoodOrderBack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FoodOrderBack.model.MenuItem;

@Repository
public interface MenuItemRepo extends JpaRepository<MenuItem, Integer>{

}
