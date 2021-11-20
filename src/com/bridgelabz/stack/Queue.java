package com.bridgelabz.stack;

public class Queue {
	private static int front, rear, capacity;
	private static int queue[];

	Queue(int size) {
		front = rear = 0;
		capacity = size;
		queue = new int[capacity];
	}

	static void queueEnqueue(int item) {

		if (capacity == rear) {
			System.out.println("Queue is full");
			return;
		}

		else {
			queue[rear] = item;
			rear++;
		}
		return;
	}

	static void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.println("Queue is Empty\n");
			return;
		}

		for (i = front; i < rear; i++) {
			System.out.println(+queue[i]);
		}
		return;
	}

}
