package LeetCode;

import java.util.ArrayDeque;

/**
 * Lancer on 2016/3/31.
 */
public class No_225 {
    private ArrayDeque<Integer> queue_1 = new ArrayDeque<>();
    private ArrayDeque<Integer> queue_2 = new ArrayDeque<>();

    // Push element x onto stack.
    public void push(int x) {
        queue_1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(queue_1.size() > 1){
            queue_2.add(queue_1.remove());
        }
        queue_1.remove();
        ArrayDeque<Integer> tmp = queue_1;
        queue_1 = queue_2;
        queue_2 = tmp;
    }

    // Get the top element.
    public int top() {
        while(queue_1.size() > 1){
            queue_2.add(queue_1.remove());
        }
        int ele = queue_1.peek();
        queue_2.add(queue_1.remove());
        ArrayDeque<Integer> tmp = queue_1;
        queue_1 = queue_2;
        queue_2 = tmp;
        return ele;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue_1.isEmpty();
    }

    public static void main(String[] args) {
        No_225 t = new No_225();

        // Test Case
        t.push(1);
        t.push(2);
        t.push(3);
        t.pop();
        System.out.println(t.top());


        System.out.println(t.empty());
        t.pop();
        System.out.println(t.top());
        System.out.println(t.empty());
        t.pop();
        System.out.println(t.empty());
    }
}
