package LinkedList;

import java.util.*;

public class MyLinkedList {

    public ListNode head, tail;

    public MyLinkedList(ListNode head, ListNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
    }

    public void addLast(Person x) {
        ListNode node = new ListNode(x);
        if (this.isEmpty()) {
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void visit(ListNode node) {
        if (node != null) {
            System.out.println(node.info);
        }
    }

    public void traverse() {
        if (this.isEmpty()) {
            return;
        }
        ListNode temp = head;
        StringBuilder output = new StringBuilder();
        while (temp != null) {
            output.append(temp.info.toString() + ", ");
            temp = temp.next;
        }
        output.setLength(output.length() - 2);
        System.out.println(output.toString());
    }

    public void addMany(String names[], int ages[]) {
        if (names.length != ages.length) {
            return;
        }
        int size = names.length;
        for (int i = 0; i < size; i++) {
            this.addLast(new Person(names[i], ages[i]));
        }
    }

    public ListNode searchByName(String name) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.info.name.equals(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public ListNode searchByAge(int age) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.info.age == age) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFirst(Person x) {
        ListNode newHead = new ListNode(x, head);
        head = newHead;
    }

    public void insertAfter(ListNode pre, Person x) {
        if (this.isEmpty() || pre == null) {
            return;
        }
        if (pre == tail) {
            this.addLast(x);
            return;
        }
        ListNode pos = new ListNode(x, pre.next);
        pre.next = pos;
    }

    public void insertBefore(ListNode pos, Person x) {
        if (this.isEmpty() || pos == null) {
            return;
        }
        if (pos == head) {
            this.addFirst(x);
            return;
        }
        ListNode temp = head;
        while (temp != null && temp.next != pos) {
            temp = temp.next;
        }
        if (temp != null) {
            this.insertAfter(temp, x);
        }
    }

    public void removeFirst() {
        if (this.isEmpty()) {
            return;
        }
        if (head.next == null) {
            this.clear();
            return;
        }
        head = head.next;
    }

    public void remove(ListNode node) {
        if (this.isEmpty() || node == null) {
            return;
        }
        if (node == head) {
            this.removeFirst();
            return;
        }
        ListNode temp = head;
        while (temp != null && temp.next != node) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }

    public void removeByName(String name) {
        ListNode temp = this.searchByName(name);
        this.remove(temp);
    }

    public void removeByAge(int age) {
        ListNode temp = this.searchByAge(age);
        this.remove(temp);
    }

    public ListNode searchPosition(int pos) {
        int start = 0;
        ListNode temp = head;
        while (temp != null) {
            if (start == pos) {
                return temp;
            }
            temp = temp.next;
            start++;
        }
        return null;
    }

    public void removeByPosition(int pos) {
        ListNode temp = this.searchPosition(pos);
        this.remove(temp);
    }

    public int size() {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public Person[] toArray() {
        int index = 0;
        int size = this.size();
        Person[] arr = new Person[size];
        ListNode temp = head;
        while (temp != null) {
            arr[index] = new Person(temp.info.name, temp.info.age);
            index++;
            temp = temp.next;
        }
        return arr;
    }

    public void sortByName() {
        ListNode pre = head;
        ListNode pos;
        while (pre != null) {
            pos = pre.next;
            while (pos != null) {
                if (pos.info.name.compareTo(pre.info.name) < 0) {
                    Person temp = pos.info;
                    pos.info = pre.info;
                    pre.info = temp;
                }
                pos = pos.next;
            }
            pre = pre.next;
        }
    }

    public void sortByAge() {
        ListNode pre = head;
        ListNode pos;
        while (pre != null) {
            pos = pre.next;
            while (pos != null) {
                if (pos.info.age < pre.info.age) {
                    Person temp = pos.info;
                    pos.info = pre.info;
                    pre.info = temp;
                }
                pos = pos.next;
            }
            pre = pre.next;
        }
    }

    public void reverse() {
        ListNode pre = null;
        ListNode pos = head;
        tail = pos;
        while (pos != null) {
            ListNode temp = pos.next;
            pos.next = pre;
            pre = pos;
            pos = temp;
        }
        head = pre;
    }

    public ListNode findMaxAge() {
        ListNode temp = head;
        ListNode rs = null;
        int max = Integer.MIN_VALUE;
        while (temp != null) {
            if (temp.info.age > max) {
                max = temp.info.age;
                rs = temp;
            }
            temp = temp.next;
        }
        return rs;
    }

    public ListNode findMinAge() {
        ListNode temp = head;
        ListNode rs = null;
        int min = Integer.MAX_VALUE;
        while (temp != null) {
            if (temp.info.age < min) {
                min = temp.info.age;
                rs = temp;
            }
            temp = temp.next;
        }
        return rs;
    }

    public void setData(ListNode node, Person x) {
        if (node != null) {
            node.info = x;
        }
    }

    public void sortAgeInRange(int start, int end) {
        if (start >= end) {
            return;
        }
        start = Math.max(start, 0);
        end = Math.min(end, this.size() - 1);
        ListNode pre = this.searchPosition(start);
        ListNode endNode = this.searchPosition(end + 1);
        while (pre != endNode) {
            ListNode pos = pre.next;
            while (pos != endNode) {
                if (pos.info.age < pre.info.age) {
                    Person temp = pos.info;
                    pos.info = pre.info;
                    pre.info = temp;
                }
                pos = pos.next;
            }
            pre = pre.next;
        }
    }

    public void reverseInRange(int start, int end) {
        if (start >= end) {
            return;
        }
        Stack<ListNode> st = new Stack<>();
        ListNode dummyHead = new ListNode();
        ListNode rs = dummyHead;
        ListNode temp = head;
        start = Math.max(start, 0);
        end = Math.min(end, this.size() - 1);
        for (int i = 0; i < start; i++) {
            dummyHead.next = temp;
            temp = temp.next;
            dummyHead = dummyHead.next;
        }
        for (int i = start; i <= end; i++) {
            st.push(temp);
            temp = temp.next;
        }
        while (!st.isEmpty()) {
            dummyHead.next = st.pop();
            dummyHead = dummyHead.next;
        }
        dummyHead.next = temp;
        head = rs.next;
    }
}
