package A_Array;

/**
 * @Classname C_Squre_L977
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/28 19:25
 * @Created by maicaoboy
 */
public class C_Squre_L977E {
    public int[] sortedSquares(int[] nums) {
        int[] ret = new int[nums.length];
        int left = 0, right = nums.length - 1, index = nums.length - 1;
        while(index >= 0) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if(r > l) {
                ret[index--] = r;
                right--;
            }else {
                ret[index--] = l;
                left++;
            }
        }
        return ret;
    }


}
