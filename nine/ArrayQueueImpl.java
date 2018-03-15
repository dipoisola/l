package l.nine;

public class ArrayQueueImpl {
	private int[] arr = new int[4];
	private int front = -1;
	private int rear = 0;
	
	public int peek() {
		if (front == -1) {
			return front;
		}
		
		return arr[front];
	}
	
	private void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}
	
	public void enqueue(int obj) {
		if (front == -1) {
			front = rear;
			arr[front] = obj;
			return;
		}
		
		if (rear == arr.length - 1) {
			resize();
		}
		
		rear++;
		arr[rear] = obj;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return rear;
		}
		
		int temp = arr[front];
		front++;
		
		return temp;
		
	}
	
	public boolean isEmpty() {
		if (front - rear >= 0)
			return true;
		
		return false;
	}
	
	public int size() {
		return (rear - front + 1);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(int i = front; i <= rear; i++) {
			sb.append(arr[i]);
		}
		
		sb.append("]");
		
		return sb.toString();
	}

	public static void main(String[] args) {
		ArrayQueueImpl queue = new ArrayQueueImpl();
		queue.enqueue(4);
		queue.enqueue(1);
		queue.enqueue(9);
		queue.enqueue(3);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.enqueue(12);
		
		System.out.println(queue);
		System.out.println(queue.size());
	}
}
