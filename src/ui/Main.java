package ui;

import model.OrderedLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(12);
		list.add(1);
		
		System.out.println(list.toString());
	}

}
