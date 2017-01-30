package com.kani.dao;
import java.util.Iterator;
import java.util.List;


import com.kani.model.Seats;

public class TestSeatsDao {

	public static void main(String[] args) {
		SeatsDAO seatsDAO = new SeatsDAO();
//		Seats seats = new Seats();
		
//		seats.setSeat_Id(1);
//		seats.setSeat_No("seat1");
		List<Seats> list= seatsDAO.list();
		Iterator<Seats> i=list.iterator();
		while(i.hasNext())
		{		
			Seats seats =(Seats)i.next();
			System.out.println(seats.getSeat_Id()+"\t"+seats.getSeat_No());
		}

	}

}
