package tasks;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class EvaluateAPostfixExpression {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the expression : ");
		String exp = s.next();
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < exp.length(); i++) {
			
			char c = exp.charAt(i);
			
			if (Character.isDigit(c)) {
				stack.add(((int) c)-48);
			} else {
				evaluate(stack, c);
			}
		}
		
		System.out.println(stack.get(stack.size()-1));
	}

	private static void evaluate(Stack<Integer> stack, char c) {
		
		int x = stack.pop(), y = stack.pop();
		switch (c) {
			case '*':
				stack.add(x*y);				
				break;
			case '/':
//				System.err.println(x +" "+ y);
				stack.add(y/x);
				break;
			case '-':
				stack.add(y-x);
				break;
			case '+':
				stack.add(x+y);
				break;
			default:
				stack.add(x);
				stack.add(y);
		}
	}
}
