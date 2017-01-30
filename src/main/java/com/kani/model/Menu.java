package com.kani.model;




import lombok.Data;

@Data
public class Menu {
	private int menuId;
	private MenuItems menuItem;
	private FoodTypes foodType;
	private int quantity;
}
