package com.kani.dao;

import com.kani.dao.CancelOrderProcedureDAO;

public class TestCancelOrderProcedureDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CancelOrderProcedureDAO dao = new CancelOrderProcedureDAO();
		
		String status = dao.cancelOrder("seat_2","varietyce",756,"@output_message");
		System.out.println(status);

	}
}


