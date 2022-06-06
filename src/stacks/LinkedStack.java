package stacks;

import util.Employee;

import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        var iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
