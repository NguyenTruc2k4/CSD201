package LinkedListQueue;

import java.util.*;

public class test {

    public static void main(String[] args) {
        // create list
        ListNode head = new ListNode(2);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(7);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(4);
        ListNode n8 = new ListNode(10);
        ListNode n9 = new ListNode(8);
        ListNode n10 = new ListNode(0);
        ListNode tail = new ListNode(11);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = tail;
        MyLinkedListQueue q = new MyLinkedListQueue(head, tail);
        System.out.println(q.isEmpty());
        q.poll();
        q.displayAll();
        System.out.println(q.peek().val);
        q.offer(new ListNode(2));
        q.displayAll();
        q.clear();
        q.displayAll();
    }
}
