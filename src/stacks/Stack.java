package stacks;

/*
    - Abstract data type
    - LIFO - Last in, First out.
    - push -> adds an item as the top item on the stack
    - pop -> removes the top item on the stack
    - peek -> gets the top item on the stack without popping it
    - Ideal backing data structure: Linked list.

    Time Complexity:

        - O(1) for push, top, and peek, when using a linked list.
        - If you use an array, then push is O(n), because the array may have to be resized.
        - If you know the maximum number of items that will ever be on the stack, an array can be a good choice.
        - If memory is tight, an array might be a good choice.
        - Linked list is ideal.
 */

import util.Employee;

public class Stack {

    public static void main(String[] args) {

       //var stack = new ArrayStack(10);
        var stack = new LinkedStack();

        stack.push(new Employee(123, "Jane", "Jones"));
        stack.push(new Employee(4567, "John", "Doe"));
        stack.push(new Employee(22, "Mary", "Smith"));
        stack.push(new Employee(3245, "Mike", "Wilson"));
        stack.push(new Employee(78, "Bill", "End"));

        //stack.printStack();
        System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
        System.out.println("-----------------------------");
        stack.printStack();

    }
}
