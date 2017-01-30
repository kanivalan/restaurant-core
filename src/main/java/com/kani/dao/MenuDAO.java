package com.kani.dao;
import com.kani.model.*;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kani.model.Menu;
import com.kani.util.ConnectionUtil;

public class MenuDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

//	public void save(Menu menu) {
//
//		String sql = "insert into Menu(Menu_Id,Menu_Item,Food_Type,Quantity) values(?,?,?,?)";
//		Object[] params = {menu.getMenuId(),menu.getMenuItem().getItem_Name(),menu.getFoodType().getSessionName(),menu.getQuantity()};
//		int rows = jdbcTemplate.update(sql, params);
//		System.out.println("No of rows inserted: " + rows);
//
//	}
	
	
    public List<Menu> list(){
		
		String sql="select Menu_Id,Menu_Item,Food_Type,Quantity FROM menu";
		return jdbcTemplate.query(sql,(rs,rowNum)->
		{
			Menu menu = new Menu();
			menu.setMenuId(rs.getInt("Menu_Id"));
			
			MenuItems menuitems=new MenuItems();
			menuitems.setId(rs.getInt("Menu_Item"));
			menu.setMenuItem(menuitems);
			
			FoodTypes foodTypes=new FoodTypes();
			foodTypes.setTypeId(rs.getInt("Food_Type"));
			menu.setFoodType(foodTypes);
			
			menu.setQuantity(rs.getInt("Quantity"));
			
			
			return menu;

		});
	}

}
