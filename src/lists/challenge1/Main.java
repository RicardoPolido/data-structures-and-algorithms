package lists.challenge1;

import util.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee marySmith = new Employee(22, "Mary", "Smith");
        Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
        Employee billEnd = new Employee(78, "Bill", "End");

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        list.addBefore(billEnd, johnDoe);
        list.addBefore(new Employee(1111, "Someone", "Else"), mikeWilson);
        list.printList();

    }
}
