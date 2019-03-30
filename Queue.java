package com.reg.data_structure;

public class Queue {

	public static void main(String[] args) throws QOverFlowException,
			QUnderFlowException {
		Q q = new Q();
		q.push("data");
		q.disp();
		q.ar = q.pop();
		q.push("zz");
		q.disp();
		q.ar = q.pop();
		q.disp();
		q.push("vvv");
		q.disp();
		q.disp();

	}

}

class Q {
	String ar[] = new String[3];
	int cursor = 0;

	void push(String data) throws QOverFlowException {
		if (cursor < ar.length) {
			ar[cursor] = data;
			cursor++;
		} else {
			QOverFlowException s = new QOverFlowException("Q is Full");
			throw s;
		}
	}

	String[] pop() throws QUnderFlowException {
		String a[] = new String[ar.length];
		if (ar[0] != null) {
			for (int i = 0; i < ar.length; i++) {
				a[i] = ar[i + 1];
			}

		} else {
			QUnderFlowException s = new QUnderFlowException("Q is empty");
			throw s;
		}
		cursor--;
		return a;

	}

	void disp() {
		System.out.println("Elements in Stack are:");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
