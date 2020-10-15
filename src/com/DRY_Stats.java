package com;

public class DRY_Stats {
    public int sum(int[] nums){
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        return sum;
    }

    public double avg(int[] nums) {
        return sum(nums)*1.0/nums.length;
    }

}