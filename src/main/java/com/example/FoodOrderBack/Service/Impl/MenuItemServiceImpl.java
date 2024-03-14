package com.example.FoodOrderBack.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodOrderBack.Service.MenuItemService;
import com.example.FoodOrderBack.model.MenuItem;
import com.example.FoodOrderBack.repo.MenuItemRepo;

@Service
public class MenuItemServiceImpl implements MenuItemService {
	
	@Autowired
	private MenuItemRepo menuItemRepo;
	
	@Override
	public List<MenuItem> getAllItems(){
		return menuItemRepo.findAll();
	}
	
	@Override
	public MenuItem deleteItemId(int id) {
		MenuItem student = menuItemRepo.findById(id).get();
		menuItemRepo.delete(student);
		return student;
	}
//	@Override
//	public MenuItem updateMenuItem(Integer menuitemid, String menuname, String menudesc, double menuprice, String image) {
//		MenuItem menuItem = menuItemRepo.findById(menuitemid).get();
//		menuItem.setMenudesc(menuname);
//		menuItem.setMenuitemid(menuitemid);
//		menuItem.setMenudesc(menudesc);
//		menuItem.setMenuprice(menuprice);
//		menuItem.setImage(image);
//		MenuItem savedEntity = menuItemRepo.save(menuItem);
//		return menuItem;
//	}
}
