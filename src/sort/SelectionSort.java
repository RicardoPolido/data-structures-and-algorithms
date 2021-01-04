package sort;

/*

    Selection Sort (Sort Algorithms)

    The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning

    - In-place algorithm.
    - O(n²) time complexity - quadratic.
    - It will take 100 steps to sort 10 items, 10.000 steps to sort 100 items, 1.000.000 steps to sort 1000 items.
    - Doesn't require as much swapping as Bubble Sort.
    - Unstable Algorithm

 */


public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }
}
