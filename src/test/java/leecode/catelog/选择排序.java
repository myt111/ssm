package leecode.catelog;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,9,7,4,6,5,8};
        int n = nums.length;
        for (int i = 0; i < n-1; ++i) {
            int minIndex = i;
            for (int j = i+1; j < n; ++j) {
                if (nums[j] < nums[minIndex]) { // 寻找最小的数
                    minIndex = j;				// 将最小的数保存到索引里
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
