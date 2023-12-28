package A_Array;

/**
 * @Classname A_BinarySearch
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/28 19:03
 * @Created by maicaoboy
 */
public class A_BinarySearch_L704E {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;
        while(left <= right) {
            mid = (right + left) / 2;
            if(nums[mid] > target) {
                right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
