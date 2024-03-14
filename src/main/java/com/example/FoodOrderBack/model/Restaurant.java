package com.example.FoodOrderBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {
	@Id
	@GeneratedValue
	private int restaurantid;
	private String restname;
	private String restdesc;
	private String restaddress;
	private int phonenumber;
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getRestname() {
		return restname;
	}
	public void setRestname(String restname) {
		this.restname = restname;
	}
	public String getRestdesc() {
		return restdesc;
	}
	public void setRestdesc(String restdesc) {
		this.restdesc = restdesc;
	}
	public String getRestaddress() {
		return restaddress;
	}
	public void setRestaddress(String restaddress) {
		this.restaddress = restaddress;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}
