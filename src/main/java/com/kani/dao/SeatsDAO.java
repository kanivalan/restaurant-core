package com.kani.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import com.kani.model.Seats;
import com.kani.util.ConnectionUtil;

public class SeatsDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	public void save(Seats seats) {
		
		String sql = "insert into Seats(Seat_Id,Seat_No) values(?,?)";
		Object[] params = {seats.getSeat_Id(),seats.getSeat_No()};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
	   public List<Seats> list(){
			
			String sql=" select Seat_Id,Seat_No FROM seats";
			return jdbcTemplate.query(sql,(rs,rowNum)->
			{
				Seats seats = new Seats();
				seats.setSeat_Id(rs.getInt("Seat_Id"));
				seats.setSeat_No(rs.getString("Seat_No"));				
				return seats;

			});
		}
}
