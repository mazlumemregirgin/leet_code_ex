public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};
        FindMaxConsecutivesOnes solution = new FindMaxConsecutivesOnes();

        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Max Consecutives ones: " + result);


        int[] nums2 = {555,901,482,1771};
        FindNumbersWithEvenNumberDigits solution2 = new FindNumbersWithEvenNumberDigits();
        int result2= solution2.findNumbersWithEvenNumberDigits(nums2);
        System.out.println("numbers with even number digits " + result2);

    }
}