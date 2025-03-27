public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};
        FindMaxConsecutivesOnes solution = new FindMaxConsecutivesOnes();

        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Max Consecutives ones: " + result);

    }
}