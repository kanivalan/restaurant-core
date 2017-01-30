package com.kani.dao;
import com.kani.model.SeatStatus;

public class TestSeatStatus {

	public static void main(String[] args) {
	
		SeatStatusDAO seatsstatusDAO = new SeatStatusDAO();
		SeatStatus seatstatus = new SeatStatus();
		
		seatstatus.setId(1);
		seatstatus.setSeatId(1);
		seatstatus.setSeatAvailablity("available");
		seatstatus.isState("false");
	}

}
