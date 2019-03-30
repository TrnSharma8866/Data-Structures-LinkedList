package com.reg.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class StackDemo {
	// initialising of a String Array
	String[] arr = new String[4];
	// for initial index cursor value is taking as ZERO
	int cursor = 0;

	// The Methos to push the elements into stack
	void push(String data) throws StackOverFlowException {
		if (cursor < arr.length) {
			arr[cursor] = data;
			cursor++;
		} else {
			StackOverFlowException s = new StackOverFlowException(
					"Stack is Full");
			throw s;
		}
	}

	void pop() throws StackUnderFlowException {
		if (cursor > 0) {
			int x = cursor - 1;
			arr[x] = null;
			cursor--;
		} else {
			StackUnderFlowException p = new StackUnderFlowException(
					"Stack is empty");
			throw p;
		}

	}

	void display() {
		System.out.println("The Elements in stack are :  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The element in " + i + " Index of Stack : "
					+ arr[i]);
		}
	}

}