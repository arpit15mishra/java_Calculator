package com.arpit.Util;

public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void insert(char operator, int operand1, int operand2) {
		Node newNode = new Node(operator,null,operand1,operand2);
		if(root==null) {
			root = newNode;
			return;
		}
		Node temp = root;

		while(temp.getoperatorPrecedance()<=temp.getoperatorPrecedance(operator)&&temp.getChild()!=null) 
				temp = temp.getChild();
		if(temp.getChild()!=null) {	
		newNode.setChild(temp.getChild());
		temp.setChild(newNode);
		}else {
			temp.setChild(newNode);
		}

		
	}
	
	public int evaluate() {
		Node temp = root;
		int result = 0;
		
		while(temp.getChild()!=null) {
			temp.getChild().setOperand1(temp.getResult());
			temp = temp.getChild();
			
		}
		result = temp.getResult();
		System.out.println(result);
		
		return result;
	}

}
