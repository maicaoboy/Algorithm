package C_HashTable;

import java.util.Arrays;

/**
 * @Classname A_ValidAnagram_L242E
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/4 10:04
 * @Created by maicaoboy
 */
public class A_ValidAnagram_L242E {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        Arrays.fill(s1, 0);
        Arrays.fill(s2, 0);
        for (char c : s.toCharArray()) {
            s1[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            s2[c - 'a']++;
        }
        for (int i = 0; i < s1.length; i++) {
            if(s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
}
