package com.bridgelabz.stack;

public class Queue_Main {
	public static void main(String[] args) {
		Queue q = new Queue(4);

		System.out.println("Initial Queue:");

		q.queueDisplay();

		q.queueEnqueue(10);
		q.queueEnqueue(56);
		q.queueEnqueue(30);
		q.queueEnqueue(70);

		System.out.println("Queue after Enqueue Operation:");
		q.queueDisplay();
		q.queueDequeue(); 
		q.queueDequeue(); 
	    System.out.printf("Queue after two dequeue operations :"); 

	}

}
