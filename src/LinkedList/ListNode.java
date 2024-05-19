package LinkedList;

import java.util.*;

public class ListNode {

    public Person info;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(Person info) {
        this.info = info;
        this.next = null;
    }

    public ListNode(Person info, ListNode next) {
        this.info = info;
        this.next = next;
    }

}
