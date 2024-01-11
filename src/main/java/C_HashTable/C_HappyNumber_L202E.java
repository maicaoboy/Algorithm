package C_HashTable;

import java.util.HashSet;

/**
 * @Classname C_HappyNumber_L202E
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/1/4 10:46
 * @Created by maicaoboy
 */
public class C_HappyNumber_L202E {
    public boolean isHappy(int n) {
        HashSet<Integer> integers = new HashSet<>();
        while(!integers.contains(n) && n != 1) {
            integers.add(n);
            int sum = 0;
            while(n > 0) {
                int yu = n % 10;
                n /= 10;
                sum += yu * yu;
            }
            n = sum;
        }
        return n == 1;
    }
}
