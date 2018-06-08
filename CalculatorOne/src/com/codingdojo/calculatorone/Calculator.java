package com.codingdojo.calculatorone;

public class Calculator implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private double operandOne = 0.00;
	private double operandTwo = 0.00;
	private String operation = "";
	private double result = 0.00;
	
	public Calculator() {}
	
	private double getOperandOne() {
		return operandOne;
	}
	
	public void setOperandOne(double d) {
		this.operandOne = d;
	}
	
	private double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperandTwo(double c) {
		this.operandTwo = c;
	}
	
	private String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	private double getResult() {
		return result;
	}
	
	private void setResult(double result) {
		this.result = result;
	}
	
	public void performOperation() {
		double a = this.getOperandOne();
		double b = this.getOperandTwo();
		String oper = this.getOperation();
		
		if(oper == "+") {
			double result = a + b;
			this.setResult(result);
		}else if(oper == "-") {
			double result = a - b;
			this.setResult(result);
		}else {
			System.out.println("Bad Operation Type");
		}
	}
	
	public void getResults() {
		System.out.println("The result of the entered information is " + this.getResult());
	}
}
