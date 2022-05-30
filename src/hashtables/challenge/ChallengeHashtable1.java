package hashtables.challenge;


import static java.lang.Math.abs;

/*
    Determine the method "hash" to make that code works.
 */
public class ChallengeHashtable1 {

    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numsToAdd = {59382, 34, 6894, 500, 99, -58};

        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int hash(int value) {
        return abs(value % 10);
    }
}
