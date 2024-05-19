package LinkedListQueue;

import java.util.*;

public class MyLinkedListQueue {

    public ListNode head, tail;

    public MyLinkedListQueue(ListNode head, ListNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
    }

    public void offer(ListNode node) {
        if (node == null) {
            return;
        }
        if (this.isEmpty()) {
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public ListNode peek() {
        if (this.isEmpty()) {
            return null;
        }
        return head;
    }

    public ListNode poll() {
        if (this.isEmpty()) {
            return null;
        }
        ListNode deleteNode = head;
        if (head.next == null) {
            head = tail = null;
            return deleteNode;
        }
        head = head.next;
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
