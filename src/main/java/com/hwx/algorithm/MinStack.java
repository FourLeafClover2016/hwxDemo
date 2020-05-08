package com.hwx.algorithm;

import java.util.Stack;

/**
 * 最小栈，具有push，pop，getMin方法
 */
public class MinStack {

    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(Integer value) {
        mainStack.push(value);
        if (minStack.empty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public Integer pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("null");
        }
        Integer val = mainStack.pop();
        if (minStack.peek().equals(val)) {
            minStack.pop();
        }
        return val;
    }

    public Integer getMin() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("null");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(4);
        minStack.push(9);
        minStack.push(7);
        minStack.push(3);
        minStack.push(8);
        minStack.push(5);

        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());


    }

}
