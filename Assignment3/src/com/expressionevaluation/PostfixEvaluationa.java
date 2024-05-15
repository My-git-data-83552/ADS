package com.expressionevaluation;
//Implement following algorithms for multi digit numbers 

//i. 	postfix evaluation
//ii. 	prefix evaluation

import com.stack.Stack;

public class PostfixEvaluationa {

	public static int calculate(int op1, char ele, int op2) {
		switch (ele) {
		case '$':
			return (int) Math.pow(op1, op2);

		case '*':
			return op1 * op2;

		case '/':
			return op1 / op2;

		case '+':
			return op1 + op2;

		case '-':
			return op1 - op2;

		case '%':
			return op1 % op2;

		}
		return 0;
	}

	public static int postfixEvaluation(String postfix) {

		Stack s = new Stack(10);

		for (int i = 0; i < postfix.length(); i++) {

			int index = 0;
			int arr[] = new int[2];
			char element = postfix.charAt(i);

			if (!Character.isDigit(element)) {
				int op1 = s.pop();
				int op2 = s.pop();

				int result = calculate(op1, element, op2);
				s.push(result);
			} else {
				for (int j = i; j <= i + 1; j++) {
					arr[index] = postfix.charAt(j) - '0';
					index++;
				}
				s.push(arr[0] * 10 + arr[1]);
				i++;
//				System.out.println(s.peek());
			}
		}
		if (!s.isEmpty()) {
			return s.peek();
		}
		return 0;
	}

	public static int prefixEvaluation(String prefix) {
		Stack s = new Stack(10);
		int index;
		int arr[];

		for (int i = prefix.length() - 1; i >= 0; i--) {
			char element = prefix.charAt(i);
			index = 0;
			arr = new int[2];

			if (!Character.isDigit(element)) {
				int op1 = s.pop();
				int op2 = s.pop();

				int result = calculate(op1, element, op2);
				s.push(result);
			} else {
				for (int j = i; j >= i - 1; j--) {
					arr[index] = prefix.charAt(j) - '0';
					index++;
				}
				s.push(arr[0] + arr[1] * 10);
				i--;
//				System.out.println(s.peek());
			}

		}
		if (!s.isEmpty())
			return s.peek();
		return 0;
	}

	public static void main(String[] args) {
		String postfix = "6535+";
		int postfixResult = postfixEvaluation(postfix);
		System.out.println("Postfix Evaluation for (" + postfix + ") result is - " + postfixResult);

		String prefix = "+6535";
		int prefixResult = prefixEvaluation(prefix);
		System.out.println("Prefix Evaluation for (" + prefix + ") result is - " + prefixResult);
	}
}
