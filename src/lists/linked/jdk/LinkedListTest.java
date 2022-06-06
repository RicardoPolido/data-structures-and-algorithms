package lists.linked.jdk;

import util.Employee;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        var janeJones = new Employee(123, "Jane", "Jones");
        var jonhDoe = new Employee(4567, "Jonh", "Doe");
        var marySmith = new Employee(22, "Mary", "Smith");
        var mikeWilson = new Employee(3245, "Mike", "Wilson");
        var billEnd = new Employee(78, "Bill", "End");

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(jonhDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        list.add(billEnd);

        list.removeFirst();
        list.removeLast();

        var iter = list.iterator();

        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");



    }
}
