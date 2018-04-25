package com.test;

public class Calculator {

	/**
	 * Calculates the cost of fruits
	 * 
	 * @param fruit
	 * @return
	 */
	public double calculateCost(Fruit fruit){
		double totalCost = 0;
		try{
			totalCost = fruit.getWeight() * fruit.getPricePerKg();
		}catch(Exception e){
			e.printStackTrace();
		}
		return totalCost;
	}
}
