package com.kani.dao;
import java.sql.Types;
import java.time.LocalTime;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.kani.util.*;

public class OrderProcedureDAO {


	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public String placeOrder(String items,String quantity,String seatnumber,LocalTime orderTime,String message) {
        SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sub_order")
                .declareParameters(
                		new SqlParameter("items", Types.LONGNVARCHAR),
                        new SqlParameter("quantity", Types.LONGNVARCHAR),
                        new SqlParameter("seat_number", Types.VARCHAR),
                        new SqlParameter("order_time", Types.VARCHAR),
                        new SqlOutParameter("message", Types.VARCHAR));
        call.setAccessCallParameterMetaData(false);
        SqlParameterSource in = new MapSqlParameterSource() .addValue("items", items)
        													.addValue("quantity",quantity)
        													.addValue("seat_number", seatnumber)
        													.addValue("order_time",orderTime );
        Map<String, Object> execute = call.execute(in);
        String status = (String) execute.get("message");
        return status;
 
    }
}