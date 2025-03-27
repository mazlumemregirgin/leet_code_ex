import java.util.Arrays;
public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int arr_len=nums.length;

        int[] squares_list= new int[arr_len];

        for(int i=0;i<arr_len;i++){
            squares_list[i]=nums[i]*nums[i];
        }
        Arrays.sort(squares_list);

        return squares_list;
    }
}
