package com.kani.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kani.model.FoodTypes;
import com.kani.util.ConnectionUtil;

public class FoodTypesDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void save(FoodTypes foodtypes) {

		String sql = "insert into Food_Types(Type_id,Session_Name,Start_Time,End_Time) values(?,?,?,?)";
		Object[] params = { foodtypes.getTypeId(),foodtypes.getSessionName(),foodtypes.getStartTime(),foodtypes.getEndTime() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

}
