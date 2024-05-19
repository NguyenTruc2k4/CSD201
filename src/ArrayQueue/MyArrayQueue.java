package ArrayQueue;

import java.util.*;

public class MyArrayQueue {

    public int[] queue;
    public int size;
    public int lastIndex = -1;

    public MyArrayQueue() {
        this.size = 50;
        this.queue = new int[this.size];
    }

    public MyArrayQueue(int size) {
        this.size = size;
        this.queue = new int[this.size];
    }

    public boolean isEmpty() {
        return this.lastIndex == -1;
    }

    public boolean isFull() {
        return this.lastIndex == this.size - 1;
    }

    public void grow() {
        int newSize = this.size + this.size / 2;
        int newQueue[] = new int[newSize];
        for (int i = 0; i <= lastIndex; i++) {
            newQueue[i] = this.queue[i];
        }
        this.size = newSize;
        this.queue = newQueue;
    }

    public void offer(int x) {
        if (this.isFull()) {
            return;
        }
        lastIndex++;
        if (this.isEmpty()) {
            queue[0] = x;
            return;
        }
        int cur, pre = queue[0];
        for (int i = 1; i <= lastIndex; i++) {
            cur = queue[i];
            queue[i] = pre;
            pre = cur;
        }
        queue[0] = x;
    }

    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        return queue[0];
    }

    public int poll() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        int deleteElement = queue[0];
        for (int i = 0; i < lastIndex; i++) {
            queue[i] = queue[i + 1];
        }
        lastIndex--;
        return deleteElement;
    }

    public void displayAll() {
        if (this.isEmpty()) {
            System.out.println("[]");
            return;
        }
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int i = 0; i <= lastIndex; i++) {
            output.append(queue[i] + ", ");
        }
        output.setLength(output.length() - 2);
        output.append("]");
        System.out.println(output.toString());
    }
}
