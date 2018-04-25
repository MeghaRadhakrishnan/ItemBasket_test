package com.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try{
			List<Fruit> basket = new ArrayList<Fruit>();
			basket.add(new Fruit(1, 10, "Apple"));
			basket.add(new Fruit(2, 5, "Banana"));
			basket.add(new Fruit(1, 5, "Orange"));
			basket.add(new Fruit(1.5, 10, "Lemon"));
			basket.add(new Fruit(1, 10, "Peach"));
			
			Calculator calc = new Calculator();
			double totalCost = 0;
			for(int i=0; i < basket.size();i++){
				totalCost += calc.calculateCost(basket.get(i));
			}
			System.out.println("Total Basket Cost: "+ totalCost);

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
