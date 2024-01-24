package C_HashTable;

import java.util.Arrays;

public class F_RansomNote_L383E {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            counts[c - 'a']--;
        }
        for (int count : counts) {
            if(count < 0) {
                return false;
            }
        }
        return true;
    }
}
