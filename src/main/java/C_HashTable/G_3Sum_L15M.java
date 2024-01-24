package C_HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G_3Sum_L15M {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) return ret;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) ret.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum > 0) {
                    k--;
                }else if(sum < 0){
                    j++;
                }else {
                    while (k > j && nums[k] == nums[k - 1]) k--;
                    while (k > j && nums[j] == nums[j + 1]) j++;
                    k--;
                    j++;
                }
            }
        }
        return ret;
    }

}


