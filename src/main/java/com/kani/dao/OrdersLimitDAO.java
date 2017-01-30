package com.kani.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kani.model.OrdersLimit;
import com.kani.util.ConnectionUtil;

public class OrdersLimitDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(OrdersLimit orderslimit) {

		String sql = "insert into Orders_Limit(id,order_limit) values(?,?)";
		Object[] params = {orderslimit.getId(),orderslimit.getOrder_limit()};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
	
}
