package dsa;

public class CircularQueueX {
	private double[] queueArray;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	public CircularQueueX(int s) {
		maxSize = s;
		nItems = 0;
		rear = -1;
		front = 0;
		queueArray = new double[maxSize];		
	}
	
	public boolean isEmpty() {
		if(nItems == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(nItems == maxSize)
			return true;
		else
			return false;
	}
	
	public int size() {
		return nItems;
	}
		
	public void insert(double j) {
		if(isFull()) {
			System.out.println("The queue is full");
		}
		else {
			if(rear == maxSize - 1) {
				rear = -1;
			}
			
			rear++;
			queueArray[rear] = j;
			nItems++;
		}
	}
	
	public double remove() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -99;
		}
		else {
			double temp = queueArray[front];
			nItems--;
			
			if(front == maxSize - 1)
				front = 0;
			else
				front++;
			
			return temp;
		}
	}
	
	public double peekFront() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return -99;
		}
		else {
			return queueArray[front];
		}
	}
}
