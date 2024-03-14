package com.example.FoodOrderBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menuitem")
public class MenuItem {
	@Id
	@GeneratedValue
	private int menuitemid;
	private String menuname;
	private String menudesc;
	private double menuprice;
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getMenuitemid() {
		return menuitemid;
	}
	public void setMenuitemid(int menuitemid) {
		this.menuitemid = menuitemid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenudesc() {
		return menudesc;
	}
	public void setMenudesc(String menudesc) {
		this.menudesc = menudesc;
	}
	public double getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(double menuprice) {
		this.menuprice = menuprice;
	}
	

}
