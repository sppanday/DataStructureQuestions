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
public class Node {
    
    static Node head;
    int  data;
    Node next;
    
    Node(int d) 
    {
        data = d;
        next = null;
    }
    
    /* Reverse a linked list */
    
 Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        
        while (current !=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
 }
 
 void printList(Node node) {
     while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
     }
 }
}
