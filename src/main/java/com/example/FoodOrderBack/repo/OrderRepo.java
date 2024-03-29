package com.example.FoodOrderBack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FoodOrderBack.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
