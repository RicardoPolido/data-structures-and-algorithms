package util;

    /*
        1! = 1 * 0! = 1.
        2! = 2 * 1! = 2 * 1 = 2.
        3! = 3 * 2! = 3 * 2 * 1 = 6.
        4! = 4 * 3! = 4 * 3 * 2 * 1 = 24.

        n! = n * (n - 1)!

        keep in mind:

            Iterative algorithms usually performs better than Recursive algorithms, because of the Stack Over Flow Exception, and it's more effort to push method on stack than iterate.

     */

public class Recursion {

    public static void main(String[] args) {

        System.out.println(iterativeFactorial(6));
        System.out.println(recursiveFactorial(6));

    }

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }
}
