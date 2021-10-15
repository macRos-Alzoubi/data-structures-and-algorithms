package MacStack;

import Stack.Stack;

public class MaxStack {
  private final Stack<Integer> stack;
  private final Stack<Integer> maxStack;


  public MaxStack() {
    stack = new Stack<Integer>();
    maxStack = new Stack<Integer>();
  }

  public void push(int data) {
    int maxVal = data;
    try {
      if (!maxStack.isEmpty() && maxVal < maxStack.peek())
        maxVal = maxStack.peek();
      stack.push(data);
      maxStack.push(maxVal);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void pop() {
    try {
      stack.pop();
      maxStack.pop();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public int getMax(){
    try {
      return maxStack.peek();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return -1;
  }
}
