package com.revature.Practice;

import java.util.Arrays;

public class SlidingWindowPractice {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double[] result = AverageOfSubarray.bruteAvg(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
        System.out.println(System.currentTimeMillis() - startTime + " ms");

    }
}

class AverageOfSubarray {
    public static double[] bruteAvg(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        for (int i = 0; i <= arr.length -K; i++) {
            double sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += arr[j];
            }
            result[i] = sum / K;
        }
        return result;
    }

    public static double[] slideAvg(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
        }
        return null;
    }
}
