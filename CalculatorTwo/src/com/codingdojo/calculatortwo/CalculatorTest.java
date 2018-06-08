package com.codingdojo.calculatortwo;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		c.performOperation(10.5);
		
		c.performOperation("+");
		
		c.performOperation(5.2);
		
		c.performOperation("*");
		
		c.performOperation(10.0);
		
		c.performOperation("=");
		
		c.getResults2();
	}

}
