package com.rick.problems.medium;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        int a = 1, b = 3, res;
        res = new SumOfTwoIntegersLoop().getSum(a, b);
        res = new SumOfTwoIntegersRecursion().getSum(a, b);
        System.out.println(res);
    }
}

class SumOfTwoIntegersLoop {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = ((a & b) << 1);
            a ^= b;
            b = carry;
        }
        return a;
    }
}

class SumOfTwoIntegersRecursion {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}