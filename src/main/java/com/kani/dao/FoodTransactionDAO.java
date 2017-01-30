package com.kani.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kani.model.FoodTransaction;
import com.kani.model.MenuItems;
import com.kani.util.ConnectionUtil;

public class FoodTransactionDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
//
//	public void save(FoodTransaction foodtransaction) {
//
//		String sql = "insert into Food_Transaction(id,order_id,seat_no,item_id,quantity,ordered_time,order_status) values(?,?,?,?,?,?,?)";
//		Object[] params = {foodtransaction.getId(),foodtransaction.getOrderId(),foodtransaction.getItemId().getItem_Name(),foodtransaction.getQuantity(),foodtransaction.getOrderedTime(),foodtransaction.getOrderStatus()};
//		int rows = jdbcTemplate.update(sql, params);
//		System.out.println("No of rows inserted: " + rows);
//
//	}
	
    public List<FoodTransaction> list(){
		
		String sql="select * from view_ordered_details";
		return jdbcTemplate.query(sql,(rs,rowNum)->
		{
			FoodTransaction foodtransaction = new FoodTransaction();
			foodtransaction.setId(rs.getInt("id"));
						
			foodtransaction.setOrderId(rs.getInt("order_id"));
			
			foodtransaction.setSeatNo(rs.getString("seat_no"));
			
			MenuItems menuitems = new MenuItems();			
			menuitems.setItem_Name(rs.getString("Item_Name"));
			foodtransaction.setItemId(menuitems);
			
			foodtransaction.setQuantity(rs.getInt("quantity"));
			foodtransaction.setOrderedTime(rs.getTimestamp("ordered_time"));
			foodtransaction.setOrderStatus(rs.getString("order_status"));
			
			return foodtransaction;

		});
	}
}
