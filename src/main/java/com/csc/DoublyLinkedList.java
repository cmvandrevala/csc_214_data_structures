package com.csc;

public class DoublyLinkedList {

  Node head;
  Node tail;

  static class Node {
    int data;
    Node next;
    Node previous;

    Node(int d) {
      data = d;
      next = null;
      previous = null;
    }
  }

  public static void insert(DoublyLinkedList list, int data) {
    Node new_node = new Node(data);

    if (list.head == null) {
      System.out.println("Creating the first node in the list (index 0)");
      list.head = new_node;
      list.tail = new_node;
    } else {
      Node last = list.head;
      int count = 1;
      while (last.next != null) {
        last = last.next;
        count++;
      }
      System.out.println("Creating a node with index " + count);
      new_node.previous = last;
      last.next = new_node;
      list.tail = new_node;
    }
  }

  public static void printListForward(DoublyLinkedList list) {
    System.out.println("Printing the list from head to tail");
    Node currentNode = list.head;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println("");
  }

  public static void printListBackward(DoublyLinkedList list) {
    System.out.println("Printing the list from tail to head");
    Node currentNode = list.tail;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.previous;
    }
    System.out.println("");
  }
}
