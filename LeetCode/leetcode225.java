import java.util.*;

public class leetcode225 {
    class MyStack {
        Deque<Integer> q = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x){
            q.push(x);
        }

        public int pop() {
            int peek = q.peek();
            q.poll();
            return peek;
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            if(q.size()!=0)
                return false;
            return true;
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

}
