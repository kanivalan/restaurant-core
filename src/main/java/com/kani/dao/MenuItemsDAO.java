package com.kani.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kani.model.MenuItems;
import com.kani.util.ConnectionUtil;

public class MenuItemsDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(MenuItems menuitems) {

		String sql = "insert into Menu_Items(Item_Id,Item_Name) values(?,?)";
		Object[] params = {menuitems.getId(),menuitems.getItem_Name()};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

}
