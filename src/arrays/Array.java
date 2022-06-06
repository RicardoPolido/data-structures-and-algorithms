package arrays;

/*
    Arrays:

    - Contiguous block in memory
    - Every element occupies the same amount of space in memory
    - If a array starts at memory address x, and the size of each element is y. We can calculate the memory address of the ith element by using the following expression: x + (i * y).
    - If we know the index of a element, the time to retrieve the element will be the same, no matter where it is in the array.

    Given a Array (7 positions) : 20, 35, -15, 7, 55, 1 e -22.

    So, calculating based on the expression, it would be:

        x = 12, the start block memory, just for the example, it could be anything.
        i = index of the array.
        y = bytes that the array stores, in this case: 4 bytes (int).

        x + (i * y) ->

        array[1] = 12 + (0 * 4) = 12
        array[2] = 12 + (1 * 4) = 16
        array[3] = 12 + (2 * 4) = 20
        array[4] = 12 + (3 * 4) = 24
        array[5] = 12 + (4 * 4) = 28
        array[6] = 12 + (5 * 4) = 32

    Big O notation and Arrays:

        - If we know the index, the Big O is O of 1 (constant)
        - If we don't know the index, the Big O is O of n (linear)

    Operations x Time Complexity

    Retrieve with index                                 -> O(1) - Constant time
    Retrieve without index                              -> O(n) - Linear time
    Add an element to a full array                      -> O(n)
    Add an element to the end of an array (has space)   -> O(1)
    Insert or update an element at a specific index     -> O(1)
    Delete an element by shifting elements              -> O(n)

 */

public class Array {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

    }
}
