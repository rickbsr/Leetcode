package com.rick.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {3, 2, 4}, target = 6, res[];
        res = new TwoSumBruteForce().twoSum(nums, target);
        res = new TwoSumMap_1().twoSum(nums, target);
        res = new TwoSumMap_2().twoSum(nums, target);
        for (int i : res) System.out.print(i + " ");
    }
}

class TwoSumBruteForce {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) return new int[]{i, j};
        return null;
    }
}

class TwoSumMap_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && map.get(need) != i)
                return new int[]{i, map.get(need)};
        }
        return null;
    }
}

class TwoSumMap_2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(target - nums[i], i++))
            if (i != 0 && map.containsKey(nums[i]))
                return new int[]{i, map.get(nums[i])};
        return null;
    }
}