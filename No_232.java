package LeetCode;

import java.util.Stack;

/**
 * Lancer on 2016/3/30.
 */
public class No_232 {
    public Stack<Integer> stack_1 = new Stack<>();
    public Stack<Integer> stack_2 = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        stack_1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (stack_2.isEmpty()) {
            move_element();
        }
        stack_2.pop();
    }

    // Get the front element.
    public int peek() {
        if (stack_2.isEmpty()) {
            move_element();
        }
        return stack_2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack_1.isEmpty() && stack_2.isEmpty();
    }

    private void move_element(){
        while (!stack_1.isEmpty()) {
            stack_2.push(stack_1.pop());
        }
    }

    public static void main(String[] args) {
        No_232 t = new No_232();

        t.push(1);
        t.push(2);
        t.push(3);
        t.pop();
        System.out.println(t.peek());
        t.push(4);
        t.pop();
        System.out.println(t.peek());

        System.out.println(t.empty());
        t.pop();
        System.out.println(t.empty());
        t.pop();
        System.out.println(t.empty());
    }
}
