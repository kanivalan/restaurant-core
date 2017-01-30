package com.kani.dao;

import java.sql.Types;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.kani.util.*;

public class CancelOrderProcedureDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public String cancelOrder(String seatnumber,String itemName,int orderId,String message) {
        SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName("cancel_order")
                .declareParameters(                		                       
                        new SqlParameter("seatno", Types.VARCHAR),
                        new SqlParameter("item", Types.LONGNVARCHAR),
                        new SqlParameter("order_id_param", Types.VARCHAR),                        
                        new SqlOutParameter("output_message", Types.VARCHAR));
        call.setAccessCallParameterMetaData(false);
        SqlParameterSource in = new MapSqlParameterSource() .addValue("seatno", seatnumber)
        													.addValue("item", itemName)        													        												
        													.addValue("order_id_param",orderId);
        Map<String, Object> execute = call.execute(in);
        String status = (String) execute.get("output_message");
        return status;
 
    }
}