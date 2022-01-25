package stack;

import java.util.Stack;

public class stack2 {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public stack2() {
        allData = new Stack<>();
        minData = new Stack<>();
    }

    public void push(int val) {
        if (minData.size() == 0) {
            minData.push(val);
            allData.push(val);
        } else {
            if (val <= minData.peek()) // imp point
            {
                minData.push(val);
            }
            allData.push(val);
        }
    }

    public void pop() {
        int val = allData.pop();
        if (val == minData.peek()) {
            minData.pop();
        }
    }

    public int top() {
        return allData.peek();
    }

    public int getMin() {
        return minData.peek();
    }
}