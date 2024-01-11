package C_HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @Classname B_IntersectionofTwoArrays_L349E
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/4 10:21
 * @Created by maicaoboy
 */
public class B_IntersectionofTwoArrays_L349E {
    public int[] intersection_1(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums2) {
            if(set.contains(i)) {
                set1.add(i);
            }
        }
        return set1.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] hash1 = new int[1001];
        for (int i : nums1) {
            hash1[i] = 1;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i : nums2) {
            if(hash1[i] == 1) {
                hash1[i] = 0;
                integers.add(i);
            }
        }
        int[] ints = new int[integers.size()];
        int k = 0;
        for (int i : integers) {
            ints[k++] = i;
        }
        return ints;
    }
}
