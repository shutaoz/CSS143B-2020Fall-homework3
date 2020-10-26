package Problem2;

import Problem1.LinkedListStack;


import java.util.List;
import java.util.Scanner;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        // homework
        size = 0;
        if (list == null) {
            head = new ListNode();
            return;

        }


            head = new ListNode();
            ListNode temp0 = list.head.next; //
            ListNode temp = head;


            while(temp0 != null){
                temp.next = new ListNode(temp0.val);
                temp = temp.next;
                temp0 = temp0.next;
                ++size; //

            }


    }

    public int removeAll(int valueToRemove){
        // homework


        ListNode temp = head;
        ListNode prev = null;
        int counter = 0;


        //case 1 when head has the value that needs to be removed
        while (temp != null && temp.val == valueToRemove)
        {
            head = temp.next; // Changed head
            temp = head; // Change Temp
        }

        //case 2 the head doesn't store the wanted value
        while (temp != null)
        {
            while (temp != null && temp.val != valueToRemove)
            {
                prev = temp;
                temp = temp.next;
            }


            if (temp == null)
                return counter;


            prev.next = temp.next;
            ++counter;
            --size;

            temp = prev.next;
        }

    return counter;

    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // homework
        // in-place
        if(head == null)    return;

        ListNode prev = null;
        ListNode current = head.next; //the actual linked link
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

    head.next = prev;


    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;

        //if head is null
        if(head == null){

            head = new ListNode(val);
            return;
        }
        else{
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
        }
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;
        if(otherList.head == null)   return false;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
