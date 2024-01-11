package C_HashTable;

import java.util.HashMap;

/**
 * @Classname D_TwoSum_L1E
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/4 11:29
 * @Created by maicaoboy
 */
public class D_TwoSum_L1E {
    public int[] twoSum_0(int[] nums, int target) {
        int i = 0, i1 = 0;
        for (i = 0; i < nums.length; i++) {
            for (i1 = i + 1; i1 < nums.length; i1++) {
                if((nums[i] + nums[i1]) == target) {
                    break;
                }
            }
        }
        return new int[]{i,i1};
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pi = target - nums[i];
            if(map.containsKey(pi)) {
                return new int[]{i, map.get(pi)};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
