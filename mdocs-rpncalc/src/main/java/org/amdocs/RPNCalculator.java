package org.amdocs;

import java.util.Stack;

public class RPNCalculator {
	
	private Stack<Double> numberStack;
	private double firstNumber, secondNumber, result;
	
	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result= 0.0;
	}
	
	public double evaluate(String rpnMathExpression) {
		String[] rpmTokens = rpnMathExpression.split(" ");
		for(String token : rpmTokens) {
			if(token.equals("+")) {
				extractnputs();
				result = firstNumber + secondNumber;
				
				numberStack.push( result);
			}
			else
				numberStack.push(Double.parseDouble(token));
		}
		return numberStack.pop();
	}

	private void extractnputs() {
		firstNumber = numberStack.pop();
		secondNumber = numberStack.pop();
	}


	

}
