package com.lph.jianzhi;

import java.util.Stack;

/**
 * 入栈给stack1，出栈时，若stack2不为空，则出栈，若为空，把stack1的内容全都放入stack2，然后再出栈
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack2.isEmpty()){
            return stack2.pop();
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
