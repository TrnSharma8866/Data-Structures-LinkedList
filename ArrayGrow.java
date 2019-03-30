package com.reg.data_structure;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayGrow {
	int isize, dSize;
	String[] books = { " Maths ", " Physics ", " Science ", " Economics " };
	int bsize = books.length;
	String[] addBooks, delBooks;
	Scanner s = new Scanner(System.in);

	public String[] CopyArray() {
		System.out.println("Existed Books list  : " + Arrays.toString(books));
		System.out.println("Enter How many elements have to add : ");
		isize = s.nextInt();
		addBooks = new String[books.length + isize];
		int i = 0;
		System.out.println("\nThe Array is Copying into new Array.......");
		for (i = 0; i < bsize; i++) {
			addBooks[i] = books[i];
		}
		System.out.println("\nElements from new array : "
				+ Arrays.toString(addBooks));
		return addElement(addBooks);
	}

	public String[] addElement(String[] newBooks) {
		for (int i = bsize; i < newBooks.length; i++) {
			System.out.println("Enter " + i + " Element");
			newBooks[i] = s.next();
		}

		System.out.println("After Adding elements Array is: "
				+ Arrays.toString(newBooks));
		return delBooks(newBooks);
	}

	public String[] delBooks(String[] delbooks) {
		int index;
		System.out.println("Enter the Which index element want to delete : ");
		index=s.nextInt();
		if (delbooks == null || index < 0 || index > delbooks.length)
		{
			return delbooks;
		}
		delbooks=new String[books.length-1];
		for(int i=0;k=0;i<delbooks.length;i++)
		{
			
		}
	}

}
