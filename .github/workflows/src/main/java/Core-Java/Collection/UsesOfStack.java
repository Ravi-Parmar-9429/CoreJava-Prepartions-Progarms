import java.util.*;
class UsesOfStack {
    public static void main(String[] args) {
       Stack stack = new Stack();
       
       //inserting elements into stack
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
       stack.push(50);
        System.out.println(stack);
       //remove elements from stack
       
       System.out.println(stack.pop());//top elements popped
       
       //peek top element from stack
       
       System.out.println(stack.peek());
    }
}