import java.util.Arrays;

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

        int[] nums3 = {-7,-3,2,3,11};
        SquaresOfaSortedArray solution3 = new SquaresOfaSortedArray();
        int[] result3= solution3.sortedSquares(nums3);
        System.out.println("SquaresOfaSortedArray: " + Arrays.toString(result3));
    }
}