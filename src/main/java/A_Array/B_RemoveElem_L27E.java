package A_Array;

/**
 * @Classname B_RemoveElem_L27
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/28 19:12
 * @Created by maicaoboy
 */
public class B_RemoveElem_L27E {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        int size = nums.length;
        while(fast < nums.length) {
            if(nums[fast] != val) {
                nums[slow++] = nums[fast++];
            }else {
                fast++;
                size--;
            }
        }
        return size;
    }
}
