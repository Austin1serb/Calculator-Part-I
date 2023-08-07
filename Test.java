package com.austin.calculatorpt1;

public class Test {

	public static void main(String[] args) {
	Calculator calculator = new Calculator();
	calculator.setOperandOne(10.5);
	calculator.setOperation("+");
	calculator.setOperandTwo(5.2);
	calculator.performOperation();
	calculator.getResults();
	System.out.println(calculator.getResults());
	}
	

}
