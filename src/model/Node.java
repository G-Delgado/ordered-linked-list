package model;

public class Node<T>{
	
	private Node<T> next;
	private Node<T> prev;
	private int el;
	
	Node(int element) {
		el = element;
		next = null;
		prev = null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public int getEl() {
		return el;
	}

	public void setEl(int el) {
		this.el = el;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public int compareTo(Node<T> current) {
		if (el== current.getEl()) {
			return 0;
		} else if (el > current.getEl()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
