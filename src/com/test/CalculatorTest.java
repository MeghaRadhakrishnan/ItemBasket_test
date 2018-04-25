package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Calculator calc = new Calculator();
		Fruit fruit = new Fruit(1, 10, "Apple");
		assertEquals(10, calc.calculateCost(fruit));
	}

}
