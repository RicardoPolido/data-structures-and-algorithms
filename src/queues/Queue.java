package queues;

/*
    - Abstract data type
    - FIFO -> first in, first out.
    - add -> also called enqueue - add an item to the end of the queue.
    - remove -> also called dequeue - remove the item at the front of the queue.
    - peek -> get the item at the front of the queue, but don't remove it.
 */

import util.Employee;

public class Queue {

    public static void main(String[] args) {

        var janeJones = new Employee(123, "Jane", "Jones");
        var jonhDoe = new Employee(4567, "John", "Doe");
        var marySmith = new Employee(22, "Mary", "Smith");
        var mikeWilson = new Employee(3245, "Mike", "Wilson");
        var billEnd = new Employee(78, "Bill", "End");

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(janeJones);
        queue.add(jonhDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        //queue.printQueue();

        queue.remove();
        queue.remove();

        //queue.printQueue();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.add(mikeWilson);
        //System.out.println(queue.peek());
        queue.printQueue();

    }
}
