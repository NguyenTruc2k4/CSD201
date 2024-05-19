package ArrayStack;

import java.util.*;

public class MyArrayStack {

    public int stack[];
    public int lastIndex;
    public int size;

    public MyArrayStack() {
        this.size = 50;
        this.stack = new int[size];
        this.lastIndex = -1;
    }

    public MyArrayStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.lastIndex = -1;
    }

    public boolean isEmpty() {
        return lastIndex == -1;
    }

    public boolean isFull() {
        return lastIndex == size - 1;
    }

    public void clear() {
        lastIndex = -1;
    }

    public void grow() {
        int newSize = this.size + this.size / 2;
        int newStack[] = new int[newSize];
        for (int i = 0; i <= lastIndex; i++) {
            newStack[i] = stack[i];
        }
        this.size = newSize;
        this.stack = newStack;
    }

    public void push(int x) {
        if (this.isFull()) {
            return;
        }
        lastIndex++;
        stack[lastIndex] = x;
    }

    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        return stack[lastIndex];
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is empty!");
        }
        return stack[lastIndex--];
    }

    public int search(int val) throws Exception {
        int index = -1;
        for (int i = 0; i <= lastIndex; i++) {
            if (stack[i] == val) {
                index = i;
            }
        }
        if (index == -1) {
            throw new Exception("Not found!");
        }
        return index;
    }

    public void displayAll() {
        if (this.isEmpty()) {
            System.out.println("[]");
            return;
        }
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int i = 0; i <= lastIndex; i++) {
            output.append(stack[i] + ", ");
        }
        output.setLength(output.length() - 2);
        output.append("]");
        System.out.println(output.toString());
    }

}
