package com.revature.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowPractice {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double[] result = AverageOfSubarray.bruteAvg(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        startTime = System.currentTimeMillis();
        result = AverageOfSubarray.slideAvg(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
        System.out.println(System.currentTimeMillis() - startTime + " ms");

        int r = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + r);
        r = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + r);
        r = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + r);

        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + LongestSubstringKDistinct.findLength("cbbebi", 3));
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

            if (windowEnd >= K - 1) {
                result[windowStart] = windowSum / K;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}

class MinSizeSubArraySum{
    public static int findMinSubArray(int s, int[] arr) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= s) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

class LongestSubstringKDistinct{
    public static int findLength(String str, int k) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        int start = 0, max =0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            char rightChar = str.charAt(end);
            charFreqMap.put(rightChar, charFreqMap.getOrDefault(rightChar, 0) + 1);

            while (charFreqMap.size() > k) {
                char leftChar = str.charAt(start);
                charFreqMap.put(leftChar, charFreqMap.get(leftChar) - 1);
                if (charFreqMap.get(leftChar) == 0) {
                    charFreqMap.remove(leftChar);
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
