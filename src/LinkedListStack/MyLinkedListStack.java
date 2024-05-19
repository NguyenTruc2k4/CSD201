package LinkedListStack;

import java.util.*;

public class MyLinkedListStack {

    private ListNode head, tail;

    public MyLinkedListStack(ListNode head, ListNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
    }

    public void push(ListNode node) {
        if (node == null) {
            return;
        }
        if (this.isEmpty()) {
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public ListNode peek() {
        if (this.isEmpty()) {
            return null;
        }
        return tail;
    }

    public ListNode pop() {
        if (this.isEmpty()) {
            return null;
        }
        ListNode deleteNode = tail;
        if (head.next == null) {
            head = tail = null;
            return deleteNode;
        }
        ListNode temp = head;
        while (temp != null && temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return deleteNode;
    }

    public void displayAll() {
        if (this.isEmpty()) {
            System.out.println("[]");
            return;
        }
        StringBuilder output = new StringBuilder();
        ListNode temp = head;
        output.append("[");
        while (temp != null) {
            output.append(temp.val + ", ");
            temp = temp.next;
        }
        output.setLength(output.length() - 2);
        output.append("]");
        System.out.println(output.toString());
    }
}
