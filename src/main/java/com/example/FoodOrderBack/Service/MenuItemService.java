package com.example.FoodOrderBack.Service;

import java.util.List;

import com.example.FoodOrderBack.model.MenuItem;

public interface MenuItemService {

	List<MenuItem> getAllItems();

	MenuItem deleteItemId(int id);
	

//	MenuItem updateMenuItem(Integer menuitemid, String menuname, String menudesc, double menuprice, String image);
}
