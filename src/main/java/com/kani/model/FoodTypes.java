package com.kani.model;

import java.time.LocalTime;

import lombok.Data;

@Data
public class FoodTypes {
	private int typeId;
	private String sessionName;
	private LocalTime startTime;
	private LocalTime endTime;
	
}
