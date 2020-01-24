package dsa;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		/*CircularQueueX q = new CircularQueueX(4);
		
		System.out.println(q.peekFront());
		System.out.println(q.remove());
		
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		
		System.out.println(q.peekFront());
		
		System.out.println(q.remove());
		q.insert(5);*/
		
		int k = 6;
		
		Scanner sc = new Scanner(System.in);
		
		CircularQueueX q = new CircularQueueX(10);
		StackX s = new StackX(k);	
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			q.insert(sc.nextDouble());
		}
		
		sc.close();
		
		for(int i = 0; i < k; i++)
			s.push(q.remove());
		
		for(int i = 0; i < k; i++)
			q.insert(s.pop());
		
		for(int i = 0; i < q.size() - k; i++)
			q.insert(q.remove());
		
		while(!q.isEmpty())
			System.out.println(q.remove());
	}
}
