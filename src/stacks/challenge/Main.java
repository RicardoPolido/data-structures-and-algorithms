package stacks.challenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));

        // should return true
        System.out.println(checkForPalindromeInstructorSolution("abccba"));
        // should return true
        System.out.println(checkForPalindromeInstructorSolution("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindromeInstructorSolution("I did, did I?"));
        // should return false
        System.out.println(checkForPalindromeInstructorSolution("hello"));
        // should return true
        System.out.println(checkForPalindromeInstructorSolution("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        // removing all special characters from string.
        var newString = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        var stack = new LinkedList<Character>();

        // increment the stack.
        for (char cha : newString.toCharArray()) {
            stack.push(cha);
        }

        // Keep the values of the old stack to compare.
        var oldStack = new LinkedList<Character>(stack);

        var reverseStack = new LinkedList<Character>();

        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        return oldStack.equals(reverseStack);
    }

    public static boolean checkForPalindromeInstructorSolution(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPonctuation = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPonctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());

        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPonctuation.toString());

    }
}
