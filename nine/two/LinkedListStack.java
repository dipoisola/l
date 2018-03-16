package l.nine.two;

public class LinkedListStack implements Stack1{
	private Node top;
	
	public LinkedListStack() {
		top = new Node(null, null);
	}

	@Override
	public String toString() {
		return top.value.toString();
	}

	@Override
	public void push(Object ob) {
		if (top == null) {
			top = new Node(ob, null);
			return;
		}
		
		Node temp = top;
		while (temp.next != null) {
			temp = temp.next; 
		}
		
		temp.next = new Node(ob, null);
//		top = temp;
	}

	@Override
	public Object pop() {
		if (top == null) return top;
		
		Node temp = top;
		while (temp.next.next != null) {
			temp = temp.next; 
		}
		Node returnValue = temp.next;
		temp.next = null;
		
		return returnValue;
	}

	@Override
	public Object peek() {
		if (top == null) return null;
		
		Node temp = top;
		while (temp.next != null) {
			temp = temp.next; 
		}
		
		return temp;
	}

	@Override
	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}

	@Override
	public int size() {
		int size = 0;
		
		if (top == null)
			return 0;
		
		Node temp = top;
		while (temp.next != null) {
			temp = temp.next;
			size++;
		}
		
		return size;
	}
	
	class Node {
		Object value;
		Node next;
		
		public Node(Object value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return value.toString();
		}
	}

}


