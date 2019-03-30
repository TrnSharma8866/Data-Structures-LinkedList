package com.reg.data_structure;

public class LinkedList {
	Node head = null;
	Node current = null;

	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			current = n;
		}
	}

	void remove(int data) {
		Node temp = null;
		Node n = head;
		while (n != null) {
			if (n.data == data) {
				temp.nextNode = n.nextNode;
				break;
			}
			temp = n;
			n = n.nextNode;
		}
	}

	int max() {
		Node temp = head;
		int max = head.data;
		while (temp != null) {
			if (temp.data > max) {
				max = temp.data;
			}
			temp = temp.nextNode;
		}
		System.out.println(max);
		return max;
		
	}
	int min() {
		Node temp = head;
		int min = head.data;
		while (temp != null) {
			if (temp.data < min) {
				min = temp.data;
			}
			temp = temp.nextNode;
		}
		System.out.println(min);
		return min;
		
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println("The data at node : " + n.data);
			n = n.nextNode;
		}

	}

}
