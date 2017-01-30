package com.kani.model;

import lombok.Data;

@Data
public class SeatStatus {

	private int id;
	private Seats seatId;
	private String seatAvailablity;
	private boolean state;
}
