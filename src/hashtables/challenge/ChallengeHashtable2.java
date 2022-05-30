package hashtables.challenge;

import util.Employee;

import java.util.*;

/*
    1. Remove duplicate items from a linked list.
    2. Your solution must use the JDK's LinkedList class.
    3. Your solution must use a HashMap.
    4. Use the starter project in the resources.
 */
public class ChallengeHashtable2 {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(123, "Jane", "Jones"));
        employees.add(new Employee(5678,"John", "Doe"));
        employees.add(new Employee(45,"Mike", "Wilson"));
        employees.add(new Employee(5555,"Mary", "Smith"));
        employees.add(new Employee(5678, "John", "Doe"));
        employees.add(new Employee(3948, "Bill", "End"));
        employees.add(new Employee(123, "Jane", "Jones"));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            }
            else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Employee employee: remove) {
            employees.remove(employee);
        }

        System.out.println("-------------------------");
        employees.forEach(e -> System.out.println(e));

//        LinkedList<Employee> employees = new LinkedList<>();
//        employees.add(new Employee(123, "Jane", "Jones"));
//        employees.add(new Employee(5678,"John", "Doe"));
//        employees.add(new Employee(45,"Mike", "Wilson"));
//        employees.add(new Employee(5555,"Mary", "Smith"));
//        employees.add(new Employee(5678, "John", "Doe"));
//        employees.add(new Employee(3948, "Bill", "End"));
//        employees.add(new Employee(123, "Jane", "Jones"));
//
//        employees.forEach(e -> System.out.println(e));
//
//        final var uniqueEmployees = new HashMap<Integer, Employee>();
//
//        employees.forEach(e -> uniqueEmployees.put(e.getId(), e));
//
//        System.out.println("-------------------------------------------------");
//
//        uniqueEmployees.forEach((k, e) -> System.out.println(e));

    }
}
