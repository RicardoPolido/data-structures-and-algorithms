package hashtables;

import util.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
    - Abstract data type.
    - Provide access to data using keys.
    - Key doesn't have to be an integer.
    - Consists of key/value pairs - data types don't have to match.
    - Optimized for retrieval (when yoy know the key)
    - Associative array is one type of hash table.

    Hashing:

        - Maps keys of any data type to an integer.
        - Hash function maps key to int.
        - In Java, hash function is Object.hashCode().
        - Collision occurs when more than one value has the same hashed value.

    Load Factor:

        - Tell us how full a hash table is.
        - Load factor = # of items / capacity = size / capacity.
        - Load factor is used to decide when to resize the array backing the hash table.
        - Don't want load factor too low (lots of empty space).
        - Don't want load factor too high (will increase the likelihood of collisions).
        - Can play a role in determining the time complexity for retrieval.

    Add to a Hash table backed by an array:

        1. Provide a key/value pair
        2. Use a hash function to hash the key an int value.
        3. Store the value at the hashed kay value - thi sis the index into the array.


 */
public class Hashtable {

    public static void main(String[] args) {

        // JDK HASHTABLE:

        var janeJones = new Employee(123, "Jane", "Jones");
        var jonhDoe = new Employee(4567, "John", "Doe");
        var marySmith = new Employee(22, "Mary", "Smith");
        var mikeWilson = new Employee(3245, "Mike", "Wilson");

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", jonhDoe);
        hashMap.put("Smith", marySmith);

        //Employee employee = hashMap.put("Doe", mikeWilson);
        Employee employee = hashMap.putIfAbsent("Doe", mikeWilson);
        System.out.println(employee);

        System.out.println(hashMap.getOrDefault("someone", mikeWilson));

        System.out.println(hashMap.remove("Jones"));

//        System.out.println(hashMap.containsKey("Doe"));
//        System.out.println(hashMap.containsValue(janeJones));
//        Iterator<Employee> iterator = hashMap.values().iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Value: " + v));



        // CHAINED HASHTABLE:

//        var janeJones = new Employee(123, "Jane", "Jones");
//        var jonhDoe = new Employee(4567, "John", "Doe");
//        var marySmith = new Employee(22, "Mary", "Smith");
//        var mikeWilson = new Employee(3245, "Mike", "Wilson");
//
//        ChainedHashtable ht = new ChainedHashtable();
//        ht.put("Jones", janeJones);
//        ht.put("Doe", jonhDoe);
//        ht.put("Wilson", mikeWilson);
//        ht.put("Smith", marySmith);
//
//        ht.printHashtable();
//
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
//
//        ht.remove("Wilson");
//        ht.remove("Jones");
//
//        System.out.println("--------------------------- AFTER REMOVE ---------------------------");
//        ht.printHashtable();
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));

        // SIMPLE HASHTABLE:
//
//        var janeJones = new Employee(123, "Jane", "Jones");
//        var jonhDoe = new Employee(4567, "John", "Doe");
//        var marySmith = new Employee(22, "Mary", "Smith");
//        var mikeWilson = new Employee(3245, "Mike", "Wilson");
//
//        SimpleHashtable ht = new SimpleHashtable();
//        ht.put("Jones", janeJones);
//        ht.put("Doe", jonhDoe);
//        ht.put("Wilson", mikeWilson);
//        ht.put("Smith", marySmith);
//
//        ht.printHashtable();
//
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
//
//        ht.remove("Wilson");
//        ht.remove("Jones");
//
//        System.out.println("--------------------------- AFTER REMOVE ---------------------------");
//        ht.printHashtable();
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
    }

}
