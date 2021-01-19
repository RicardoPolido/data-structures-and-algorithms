package sort;

import java.util.Arrays;

public class SortingArraysUsingJDK {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Arrays.sort uses the Quick Sort algorithm with Dual Pivot, that usually performs better.
        Arrays.sort(intArray);


        // Arrays.parallelSort uses a hybrid Merge-Sort with Quick-sort (arrays.sort) plus work using threads that usually performs better than regular Arrays.sort for Big Datasets.
        Arrays.parallelSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
