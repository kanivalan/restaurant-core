package com.kani.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kani.model.SeatStatus;
import com.kani.util.ConnectionUtil;

public class SeatStatusDAO {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

public void save(SeatStatus seatstatus) {

	String sql = "insert into Menu(seat_id,seat_availablity,state) values(?,?,?)";
	Object[] params = {seatstatus.getSeatId().getSeat_Id(),seatstatus.getSeatAvailablity(),seatstatus.isState()};
	int rows = jdbcTemplate.update(sql, params);
	System.out.println("No of rows inserted: " + rows);

}
}
