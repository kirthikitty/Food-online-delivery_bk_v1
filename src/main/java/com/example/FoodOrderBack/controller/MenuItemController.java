package com.example.FoodOrderBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodOrderBack.Service.MenuItemService;
import com.example.FoodOrderBack.model.MenuItem;
import com.example.FoodOrderBack.repo.MenuItemRepo;

@RestController
@RequestMapping("/menuitems")

public class MenuItemController {

@Autowired
private MenuItemRepo menuItemRepo;

@Autowired
private MenuItemService menuItemService;
	
	@PostMapping("/addmenu")
	public ResponseEntity<?> addAddMenu(@RequestBody MenuItem menuItem){
		MenuItem savedEntity = menuItemRepo.saveAndFlush(menuItem);
		return ResponseEntity.status(HttpStatus.OK)
				.body(menuItem);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<MenuItem>> getAllItems(){
		List<MenuItem>menuItem = menuItemService.getAllItems();
		return new ResponseEntity<>(menuItem, HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteItemId(@PathVariable int id){
		menuItemRepo.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("");
	}
	
//	@PutMapping("/update/{id}")
//	public ResponseEntity<?> updateMenuItem(@RequestParam int menuitemid){
//		MenuItem menuItem = menuItemService.updateMenuItem(menuitemid);
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(menuItem);
//	}
}
