package com.arpit.Util;

public class Node {
	private char operator;
	private Node child;
	private int operand1;
	private int operand2;
	
	public Node(char operator,Node child,int operand1, int operand2) {
		this.operator = operator;
		this.child = child;
		this.operand1 = operand1;
		this.operand2 = operand2;
		
	}
	
	public Node getChild() {
		return child;
	}
	public void setChild(Node child) {
		this.child = child;
	}
	
	
	public int getoperand1() {
		return operand1;
	}
	
	public int getoperand2() {
		return operand2;
	}
	
	public int getoperatorPrecedance() {
		if(operator=='*') return 1;
		
		if(operator=='/') return 2;
		
		if(operator=='+') return 3;
		
		if(operator=='-') return 4;
		return -1;
		
		
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getoperatorPrecedance(char operator) {
		if(operator=='*') return 1;
		
		if(operator=='/') return 2;
		
		if(operator=='+') return 3;
		
		if(operator=='-') return 4;
		return -1;
		
		
	}
	
	public int getResult(){
		
		if(operator=='*') return (operand1*operand2);
		
		if(operator=='/') return (operand1/operand2);
		
		if(operator=='+') return (operand1+operand2);
		
		if(operator=='-') return (operand1-operand2);
		return 0;
		
	}
	

}
