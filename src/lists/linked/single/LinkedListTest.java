package lists.linked.single;

import util.Employee;

public class LinkedListTest {

    public static void main(String[] args) {

        var janeJones = new Employee(123, "Jane", "Jones");
        var jonhDoe = new Employee(4567, "Jonh", "Doe");
        var marySmith = new Employee(22, "Mary", "Smith");
        var mikeWilson = new Employee(3245, "Mike", "Wilson");

        var list = new LinkedLists();
        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(jonhDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }

}
