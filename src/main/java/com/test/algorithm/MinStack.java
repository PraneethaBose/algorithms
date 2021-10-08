package com.test.algorithm;

import java.util.Stack;

public class MinStack {

    private final Stack<Integer> intermittentStack;
    private final Stack<Integer> minStackImpl;


    public MinStack() {
        this.intermittentStack = new Stack<>();
        this.minStackImpl = new Stack<>();
    }


    /**
     * Time Complexity O(1)
     * @param value
     */
    public void push(int value) {
        intermittentStack.push(value);
        if (minStackImpl.isEmpty() || value <= minStackImpl.peek()) {
            minStackImpl.push(value);
        }
    }


    /**
     * Time Complexity O(1)
     */
    public void pop() {
        if (intermittentStack.peek().equals(minStackImpl.peek())) {
            minStackImpl.pop();
        }
        intermittentStack.pop();
    }


    /**
     * Time Complexity O(1)
     */
    public int top() {
        return intermittentStack.peek();
    }

    /**
     * Time Complexity O(1)
     */
    public int getMin() {
        return minStackImpl.peek();
    }
}
