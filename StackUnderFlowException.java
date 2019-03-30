package com.reg.data_structure;

public class StackUnderFlowException extends Exception {

	StackUnderFlowException(String p) {
		super(p);
	}
}

class StackOverFlowException extends Exception {
	StackOverFlowException(String s) {
		super(s);
	}
}