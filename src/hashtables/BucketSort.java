package hashtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Bucket Sort

    - Uses Hashing.
    - Makes assumptions about the data, like radix and counting sort.
    - Because it makes assumptions, can sort in O(n) time.
    - Performs best when hashed values of items being sorted are evenly distributed, so there aren't many collisions.

    1. Distribute the items into buckets based on their hashed values (scattering phase).
    2. Sort the items in each bucket.
    3. Merge the buckets - can just concatenate them (gathering phase).

    A generalization of counting sort.

    The values in bucket X must be greater than the values in bucket X - 1 and less than the values in bucket X + 1.
    This means that the hash function we use must meet this requirement.

    - Not in-place
    - Stability will depend on sort algorithm used to sort the buckets - ideally, you want a stable sort.
    - To achieve O(n), must have only one item per bucket.
    - Insertion sort is often used to sort the buckets, because it is fast when the number of items is small.

*/
public class BucketSort {

    public static void main(String[] args) {

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void bucketSort(int[] input) {

        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10;
    }

}
