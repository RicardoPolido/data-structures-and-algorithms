package sort;

/*

    Shell Sort (Sot Algorithms)

    - Variation of Insertion Sort.
    - Insertion sort chooses which element to insert using a gap of 1.
    - Shell Sort starts out using a larger gap value.
    - As the algorithm runs, the gap is reduced.
    - Goal is the reduce the amount of shifting required.
    - The last gap values is always 1.
    - A gap value of 1 is equivalent to insertion sort.
    - So, the algorithm does some preliminary work (using gap values greater than 1), and then becomes insertion sort.
    - By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required.

    There many ways to calculate the gap value, and these ways could impact direct the time complexity (Big O notation).

    Let's see the Knuth Sequence:

        - Gap is calculated using ( 3 elevate k - 1) / 2.
        - We set k based on the length of the array.
        - We want the gap to be as close as possible to the length of the array we want to sort, without being greater than the length.

        Example:

            K                 /        Gap (interval)
            1                               1
            2                               4
            3                              13
            4                              40
            5                             121

    - But, in this implementation, we'll base our gap on the array's length. We'll initialize the gap (or interval) to array.length / 2.
    - On each iteration, we'll divide the gap value by 2 to get the next gap value.
    - For our array, the gap will be initialized to 3.
    - On the next iteration, it will be 1 -> Insertion sort.

    - In-place algorithm.
    - Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n²), but it can perform much better than that.
    - Doesn't require as much shifting as insertion sort, so it usually performs better.
    - Unstable algorithm.

 */

public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
