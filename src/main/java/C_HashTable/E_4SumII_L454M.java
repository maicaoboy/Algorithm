package C_HashTable;

import java.util.HashMap;

/**
 * @Classname E_4SumI_L454M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/4 11:52
 * @Created by maicaoboy
 */
public class E_4SumII_L454M {
    public int fourSumCount_0(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int count = 0;
        for (int i : nums3) {
            for (int j : nums4) {
                count += map.getOrDefault(-i - j, 0);
            }
        }
        return count;
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int[] max_min_1 = getMaxMin(nums1);
        int[] max_min_2 = getMaxMin(nums2);
        int[] max_min_3 = getMaxMin(nums3);
        int[] max_min_4 = getMaxMin(nums4);
        int res = 0;
        int max = Math.max(max_min_1[1]+max_min_2[1],-(max_min_3[0]+max_min_4[0]));
        int min = Math.min(max_min_1[0]+max_min_2[0],-(max_min_3[1]+max_min_4[1]));

        int[] arr = new int[max-min+1];
        for(int i:nums1){
            for(int j:nums2){
                arr[i+j-min]++;
            }
        }

        for(int i:nums3){
            for(int j:nums4){
                res += arr[-(i+j)-min];
            }
        }
        return res;
    }

    private int[] getMaxMin(int[] nums){
        int max = nums[0];
        int min = nums[0];
        for(int num:nums){
            if(max<num){
                max = num;
            }
            if(min>num){
                min = num;
            }
        }
        return new int[]{min,max};
    }
}
