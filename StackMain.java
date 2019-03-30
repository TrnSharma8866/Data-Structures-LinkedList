package com.reg.data_structure;

public class StackMain {
	public static void main(String ar[]) throws StackOverFlowException,
			StackUnderFlowException {
		StackDemo sd = new StackDemo();
		sd.push("One");
		sd.display();
		sd.push("Two");
		sd.display();
		sd.push("Three");
		sd.push("Three");
		sd.pop();
		sd.display();
		sd.pop();
		sd.display();
		sd.pop();
	
	}
}
