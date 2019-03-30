package com.reg.data_structure;

public class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println("After adding elements : ");
		l.display();
		l.remove(50);
		l.remove(40);
		System.out.println("After Deleting elements : ");
		l.display();
		System.out.println("The Maximum Element :");
		l.max();
		System.out.println("The Minimum Element :");
		l.min();
		
		
	}

}
