package com.csc;

class Stack {

  private int arr[];
  private int top;
  private int capacity;

  Stack() {
    arr = new int[10];
    capacity = 10;
    top = -1;
  }

  public void push(int x) {
    if (isFull()) {
      System.out.println("The stack is full! Stack overflow...");
      System.exit(1);
    }
    System.out.println("Inserting " + x + " onto the stack");
    arr[++top] = x;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("The stack is empty!");
      System.exit(1);
    }
    System.out.println("Popping an item from the stack");
    return arr[top--];
  }

  public int getSize() {
    return top + 1;
  }

  public Boolean isEmpty() {
    return top == -1;
  }

  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    System.out.println("Printing the items in the stack");
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }
}
