/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample_derek;

/**
 *
 * @author surendrapanday
 */
public class Link {

    public String bookName;
    public int millionsSold;
    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display() {
        System.out.println(bookName + ":" + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList theLinkedList = new LinkedList();
        theLinkedList.insertFirstLink("Don QUixote", 500);
        theLinkedList.insertFirstLink("The tale of two cities", 200);
        theLinkedList.insertFirstLink("The Lord of Rings", 150);
        theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

        theLinkedList.display();

        System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

        // Removes the last Link entered
        theLinkedList.removeFirst();

        //System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");

        theLinkedList.removeLink("A Tale of Two Cities");

        System.out.println("\nA Tale of Two Cities Removed\n");

        theLinkedList.display();

    }
}

class LinkedList {

    public Link firstLink;

    LinkedList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return (firstLink == null);
    }

    public void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link(bookName, millionsSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirst() {
        Link linkReference = firstLink;
        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("empty Linkedlist");
        }
        return linkReference;
    }

    public void display() {
        Link theLink = firstLink;
        while (theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;
        if (!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println();
        }
        return theLink;
    }

    public Link removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        while (currentLink.bookName != bookName) {
            if (currentLink.next == null) {
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}
