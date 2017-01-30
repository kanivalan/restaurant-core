package com.kani.dao;

import java.util.Iterator;
import java.util.List;

import com.kani.model.FoodTransaction;


public class TestFoodTransactionDAO {

	public static void main(String[] args) {


		FoodTransactionDAO foodtransactionDAO = new FoodTransactionDAO();
		
//		foodtransaction.setOrderId("");
//		foodtransaction.getSeatNo();
//		foodtransaction.setItemId();
//		foodtransaction.getQuantity();
//		foodtransaction.getOrderedTime();
//		foodtransaction.getOrderStatus();
		List<FoodTransaction> list= foodtransactionDAO.list();
		Iterator<FoodTransaction> i=list.iterator();
		while(i.hasNext())
		{		
			FoodTransaction foodtransaction =(FoodTransaction)i.next();
			System.out.println(foodtransaction.getId()+"\t"+foodtransaction.getOrderId()+"\t"+foodtransaction.getSeatNo()+"\t"+foodtransaction.getItemId().getItem_Name()+"\t"+foodtransaction.getOrderedTime()+"\t"+foodtransaction.getOrderStatus());
		}
	}
}

