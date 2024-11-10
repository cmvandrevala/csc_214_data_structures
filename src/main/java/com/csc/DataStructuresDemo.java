package com.csc;

import java.util.Scanner;

public class DataStructuresDemo {
  public static void main(String[] args) {
    System.out.println("Which data structure would you like to run via the driver program?");
    System.out.println("1. Doubly Linked List");
    System.out.println("2. Singly Linked List");
    System.out.println("3. Stack");
    System.out.println("");
    Scanner inputScanner = new Scanner(System.in);
    String choice = inputScanner.nextLine();
    System.out.println("");

    if (choice.equals("1")) {

      DoublyLinkedList list = new DoublyLinkedList();
      DoublyLinkedList.insert(list, 1);
      DoublyLinkedList.insert(list, 2);
      DoublyLinkedList.insert(list, 3);
      DoublyLinkedList.insert(list, 4);
      DoublyLinkedList.insert(list, 5);
      DoublyLinkedList.printListForward(list);
      DoublyLinkedList.printListBackward(list);

    } else if (choice.equals("2")) {

      SinglyLinkedList list = new SinglyLinkedList();
      SinglyLinkedList.insert(list, 1);
      SinglyLinkedList.insert(list, 2);
      SinglyLinkedList.insert(list, 3);
      SinglyLinkedList.insert(list, 4);
      SinglyLinkedList.insert(list, 5);
      SinglyLinkedList.printList(list);

    } else if (choice.equals("3")) {

      Stack stack = new Stack();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.printStack();
      stack.pop();
      stack.printStack();

    } else {

      System.out.println("Not a valid choice!");

    }

    inputScanner.close();
  }
}
