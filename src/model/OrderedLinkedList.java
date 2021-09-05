package model;

public class OrderedLinkedList<T> {
	
	private Node<T> first;
	private int size;
	
	public OrderedLinkedList() {
		size = 0;
		first = null;
	}
	
	public void add(int element) {
		Node<T> newNode = new Node<>(element);
		if (first == null) {
			first = newNode;
			size++;
		} else {
			boolean assigned = false;
			Node<T> current = first;
			Node<T> previous = null;
			while (current != null && !assigned) {
				if (current.compareTo(newNode) > 0) {
					assigned = true;
				} else {
					previous = current;
					current = current.getNext();
				}
				/*if ((newNode).compareTo(current) == 0) {
					if (current.getNext() != null) {						
						current.getNext().setPrev(newNode);
						newNode.setNext(current.getNext());
					}
					current.setNext(newNode);
					newNode.setPrev(current);
				} else if ((newNode).compareTo(current) < 0) {
					newNode.setPrev(current.getPrev());
					current.getPrev().setNext(newNode);
					newNode.setNext(current);
					current.setPrev(newNode);
				} else if ((newNode).compareTo(current) > 0) {
					if (current.getNext() == null) {
						current.setNext(newNode);
						newNode.setPrev(current);
					} else if (!(( newNode).compareTo(current.getNext()) > 0)) {
						current.getNext().setPrev(newNode);
						newNode.setNext(current.getNext());
						current.setNext(newNode);
						newNode.setPrev(current);
					}
				}*/
				
				/*current = current.getNext();*/
			}
			Node<T> temp = new Node<>(element);
			if (previous == null) {
				temp.setNext(first);
				first = temp;
			} else {
				temp.setNext(current);
				previous.setNext(temp);
			}
			/*if () {
				
			} else {
				
			}*/
		}
	}
	
	public void remove(int el) {
		Node<T> current = first;
		boolean changed = false;
		while(current != null && !changed) {
			if (current.getEl() == el) {
				current.getPrev().setNext(current.getNext());
				current.getNext().setPrev(current.getPrev());
				current.setNext(null);
				current.setPrev(null);
				changed = true;
			}
			current = current.getNext();
			
		}
	}
	
	public int getSize() {
		return size;
	}
	
	private String nodesToString() {
		String result = "";
		Node<T> current = first;
		while (current != null) {
			if (current.getNext() == null) {
				result += current.getEl();
			} else {
				result += current.getEl() + ", ";
			}
			current = current.getNext();
		}
		return result;
	}
	
	public String toString() {
		return "[ " + nodesToString() + " ]";
	}
	
	
}
