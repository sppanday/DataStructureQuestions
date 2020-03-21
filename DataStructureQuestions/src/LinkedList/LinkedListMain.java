/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author surendrapanday
 */


public class LinkedListMain {
    
    public static void main(String[] args) {
        Node node = new Node(85);
        node.next = new Node(15);
        node.next.next = new Node(4);
        node.next.next.next = new Node(20);
        
        System.out.println("Given Linked list");
        node.printList(node);
        node = node.reverse(node);
        System.out.println("");
        System.out.println("Reversed link list");
        node.printList(node);
    }
    
}
