package LinkedList;

import java.util.*;

public class test {

    public static void main(String[] args) {
        // create linked list
        ListNode head = new ListNode(new Person("A", 18));
        ListNode n1 = new ListNode(new Person("C", 16));
        ListNode n2 = new ListNode(new Person("B", 17));
        ListNode n3 = new ListNode(new Person("D", 20));
        ListNode n4 = new ListNode(new Person("F", 24));
        ListNode n5 = new ListNode(new Person("E", 19));
        ListNode n6 = new ListNode(new Person("J", 28));
        ListNode n7 = new ListNode(new Person("G", 15));
        ListNode n8 = new ListNode(new Person("H", 21));
        ListNode n9 = new ListNode(new Person("K", 26));
        ListNode n10 = new ListNode(new Person("Z", 30));
        ListNode tail = new ListNode(new Person("P", 22));
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
        tail.next = null;

        // test MyLinkedList func
        MyLinkedList list = new MyLinkedList(head, tail);
        // func1
//        System.out.println(list.isEmpty());
        // func2
//        list.clear();
//        System.out.println(list.isEmpty());
        // func3
//        list.addFirst(new Person("U", 25));
//        System.out.println(head.info);
        // func4
//        list.visit(n10);
        // func5
//        list.traverse();
        // func6
//        String names[] = {"X", "Y", "I"};
//        int ages[] = {26, 23, 27};
//        list.addMany(names, ages);
//        list.traverse();
        // func7
//        System.out.println(list.searchByName("K").info);
        // func8
//        System.out.println(list.searchByAge(24).info);
        // func9
//        list.insertAfter(tail, new Person("I", 24));
//        list.traverse();
        // func10
//        list.insertBefore(head, new Person("B", 29));
//        list.traverse();
        // func11
//        list.removeFirst();
//        list.traverse();
        // func12
//        list.remove(tail);
//        list.traverse();
        // func13
//        list.removeByName("A");
//        list.traverse();
        //func14
//        list.removeByAge(24);
//        list.traverse();
        // func15
//        System.out.println(list.searchPosition(2).info);
        // func16
//        list.removeByPosition(2);
//        list.traverse();
        // func17
//        System.out.println(list.size());
        // func18
//        Person[] arr = list.toArray();
//        for (Person p : arr) {
//            System.out.println(p);
//        }
        // func19
//        list.sortByName();
//        list.traverse();
        // func20
//        list.sortByAge();
//        list.traverse();
        // func21
//        list.reverse();
//        list.traverse();
        // func22
//        System.out.println(list.findMaxAge().info);
        // func23
//        System.out.println(list.findMinAge().info);
        // func24
//        list.setData(n10, new Person("X", 30));
//        list.traverse();
        // func25
//        list.sortAgeInRange(3, 7);
//        list.traverse();
        // func26
//        list.reverseInRange(3, 7);
//        list.traverse();
    }
}
