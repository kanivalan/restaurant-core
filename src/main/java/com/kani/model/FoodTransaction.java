package com.kani.model;
import java.sql.Timestamp;


import lombok.Data;

@Data

public class FoodTransaction {

	private int id;
	private int orderId;
	private String seatNo;
	private MenuItems itemId;
	private int quantity;
	private Timestamp orderedTime;
	private String orderStatus;
}
