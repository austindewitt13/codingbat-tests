package edu.cnm.deepdive;

import java.util.Arrays;

public class Array2 {

    public boolean either24(int[] nums) {
        /*I need serious help with everything.
        I feel like I'm stuck in week 2 or 3 still.*/
    }

    public int[] pre4(int[] nums) {
        int[] x = {};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4){
                x = Arrays.copyOf(nums,i);
                break;
            }
        }
        return x;
    }
}