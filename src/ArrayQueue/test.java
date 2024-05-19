package ArrayQueue;

import java.util.*;

public class test {

    public static void main(String[] args) throws Exception {
        MyArrayQueue q = new MyArrayQueue(2);
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        q.offer(1);
        q.offer(0);
        q.displayAll();
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        q.grow();
        q.offer(3);
        q.displayAll();
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.displayAll();
    }
}
