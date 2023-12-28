package A_Array;

/**
 * @Classname D_MinSubarray_L209M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/28 19:40
 * @Created by maicaoboy
 */
public class D_MinSubarray_L209M {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0, min = nums.length, flag = -1;
        int slow = 0, fast = 0;
        while(fast < nums.length) {
            if(sum < target) {
                sum += nums[fast++];
            }else {
                flag = 1;
                int cnt = fast - slow;
                if(cnt < min) {
                    min = cnt;
                }
                sum -= nums[slow++];
            }
        }
        while (sum >= target) {
            flag = 1;
            int cnt = fast - slow;
            if(cnt < min) {
                min = cnt;
            }
            sum -= nums[slow++];
        }
        if(flag > 0) {
            return min;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }
}
