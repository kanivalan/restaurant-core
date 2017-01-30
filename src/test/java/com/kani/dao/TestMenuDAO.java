package com.kani.dao;
import java.util.Iterator;
import java.util.List;

import com.kani.model.Menu;

public class TestMenuDAO {
	public static void main(String[] args) {
		//Menu menu = new Menu();
		MenuDAO menuDAO = new MenuDAO();
		
//		menu.setMenuId(menuId);
//		menu.setMenuItem(menuItem);
//		menu.setFoodType(foodType);
//		menu.setQuantity(quantity);
	
	List<Menu> list= menuDAO.list();
	Iterator<Menu> i=list.iterator();
	while(i.hasNext())
	{		
		Menu menu =(Menu)i.next();
		System.out.println(menu.getMenuId()+"\t"+menu.getMenuItem().getId()+"\t"+menu.getFoodType().getTypeId()+"\t"+menu.getQuantity());
	}
}
}
