package com.csc;

public class SinglyLinkedList {

  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public static void insert(SinglyLinkedList list, int data) {
    Node new_node = new Node(data);
    if (list.head == null) {
      System.out.println("Creating the first node in the list (index 0)");
      list.head = new_node;
    } else {
      Node last = list.head;
      int count = 1;
      while (last.next != null) {
        last = last.next;
        count++;
      }
      System.out.println("Creating a node with index " + count);
      last.next = new_node;
    }
  }

  public static void printList(SinglyLinkedList list) {
    System.out.println("Printing the list from head to tail");
    Node currentNode = list.head;
    while (currentNode != null) {
      System.out.print(currentNode.data + " ");
      currentNode = currentNode.next;
    }
    System.out.println("");
  }
}
