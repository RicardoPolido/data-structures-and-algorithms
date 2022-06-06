package lists;

import util.Employee;

import java.util.ArrayList;
import java.util.List;

/*

    If we have the index, the operation will be the O(n) - Constant time.
    If we don't have the index or if we are inserting or removing elements that are in the middle or beginning of
        the array

 */

public class ArrayLists {

    public static void main(String[] args) {

         List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(123, "Jane", "Joners"));
        employeeList.add(new Employee(4567, "Jonh", "Doe"));
        employeeList.add(new Employee(22, "Mary", "Smith"));
        employeeList.add(new Employee(3245, "Mike", "Wilson"));

//        employeeList.forEach(System.out::println);
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee(4568, "John", "Adams"));
        //.forEach(System.out::println);

        //System.out.println(employeeList.size());

        employeeList.add(3, new Employee(4567, "Jonh", "Doe"));
        //employeeList.forEach(System.out::println);

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//
//        for (Employee employee : employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee(22, "Mary", "Smith")));
        System.out.println(employeeList.indexOf(new Employee(4567, "Jonh", "Doe")));

        employeeList.remove(2);
        employeeList.forEach(System.out::println);
    }

}
