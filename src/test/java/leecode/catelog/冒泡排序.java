package leecode.catelog;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,9,7,4,6,5,8};

        for (int i = 0;i<nums.length-1;i++) {
            for (int j = 0;j<nums.length -1 -i;j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
