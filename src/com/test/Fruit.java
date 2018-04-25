package com.test;

public class Fruit {
	
	private double weight;
	private int pricePerKg;
	private String name;
	
	public Fruit(double weight, int pricePerKg, String name){
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.name = name;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public int getPricePerKg(){
		return this.pricePerKg;
	}
	public String getName(){
		return this.name;
	}
	
}
