package l.nine.two;

public class LinkedListStackDemo {

	public static void main(String[] args) {
		LinkedListStack stk = new LinkedListStack();
		Object item;
		stk.push('A'); // push 3 items onto stack
		stk.push('B');
		stk.push('C');
		stk.push(4);

		System.out.println("size(): " + stk.size());
		item = stk.pop(); // delete item
		System.out.println(item + " is deleted");
		stk.push('D'); // add three more items to the stack
		stk.push('E');
		System.out.println(stk.pop() + " is deleted");
		stk.push('G'); // push one item
		item = stk.peek(); // get top item from the stack
		System.out.println(item + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
	}

}
