package leecode;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class reverse {

    @Test
    public void testReverse() {
        String s1 = "abcd";
        char[] s = s1.toCharArray();
        int len = s.length;

        // 冒泡排序，交换
        for (int i = 0,j = len-1; i < len - 1; ++i,--j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }

        System.out.println(s1);
        System.out.println(s);

    }

}
