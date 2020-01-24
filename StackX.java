package dsa;

public class StackX {
	private int top;
	private int maxSize;
	private double[] stackArray;
	
	public StackX(int s) {
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == maxSize - 1)
			return true;
		else
			return false;
	}
	
	public void push(double j) {
		if(isFull()) {
			System.out.println("The stack is full");
		}
		else {
			top++;
			stackArray[top] = j;
		}	
	}
	
	public double pop() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return -99;
		}
		else {
			double temp = stackArray[top];
			top--;
			return temp;
		}
	}
	
	public double peek() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return -99;
		}
		else {
			//return stackArray[top];
			
			double temp = pop();
			push(temp);
			return temp;
		}
	}
}
