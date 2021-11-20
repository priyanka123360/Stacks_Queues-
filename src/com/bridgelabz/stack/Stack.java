package com.bridgelabz.stack;

public class Stack {

	private static final int MAX = 10;
	private int[] array;
	private int top;

	public Stack() {
		array = new int[MAX];
		top = -1;
	}

	public Stack(int length) {
		this.array = new int[length];
		top = -1;
	}

	public boolean push(int data) {
		if (isFull()) {
			System.out.println("Stack is overflow");
			return false;
		}

		array[++top] = data;
		System.out.println("push data into stack");
		return true;
	}

	public boolean isFull() {
		return (top >= array.length - 1);
	}

	public void display() {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(" -> " + array[i]);
		}
		System.out.println();

	}

	public int pop() {
		int data = array[top--];
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Underflow");
			return 0;
		}
		int data = array[top];
		return data;
	}

	private boolean isEmpty() {
		return top < 0;
	}

	public int size() {
		if (isEmpty()) {
			return 0;
		}
		return ++top;
	}
}
