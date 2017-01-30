package com.kani.dao;
import com.kani.model.*;

public class TestFoodTypesDAO {

	public static void main(String[] args) {

		FoodTypes foodtypes = new FoodTypes();

		FoodTypesDAO foodtypesDAO = new FoodTypesDAO();

		foodtypes.setTypeId(5);
		foodtypes.setSessionName("midnight");
//		foodtypes.setStartTime(startTime);
//		foodtypes.setEndTime(endTime);

		foodtypesDAO.save(foodtypes);
		//menuDAO.update(menu);
		//menuDAO.delete(1);

	}
}
