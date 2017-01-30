package com.kani.dao;

import com.kani.dao.OrderProcedureDAO;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestProcedureDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderProcedureDAO dao = new OrderProcedureDAO();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
		LocalTime time = LocalTime.now();
		String timeForm = formatter.format(time);
		
		
		
		String status = dao.placeOrder("VarietyRice,south indian meals","2,3","seat_2",LocalTime.parse(timeForm),"@message");
		System.out.println(status);

	}
}


