public class FindMaxConsecutivesOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int arr_len= nums.length;
        int one_cntr=0;
        int[] one_cntr_list =new int[arr_len];
        int j=0;

        for (int i=0;i<arr_len;i++){
            if (nums[i]==1){
                one_cntr++;
            }else{
                one_cntr_list[j]=one_cntr;
                one_cntr=0;
                j++;
            }
        }

        if (one_cntr > 0) {
            one_cntr_list[j] = one_cntr;
            j++;
        }

        int max_cons=0;

        for (int k=0;k<one_cntr_list.length;k++){
            if(one_cntr_list[k]>max_cons){
                max_cons=one_cntr_list[k];
            }
        }
        return max_cons;
    }
}
