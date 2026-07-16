package org.example.think;

import java.util.Arrays;

public class jul16 {
    public static void main(String[] args) {
        int nums[] = {3,6,2,8};
        int max = nums[0];
        long sum = 0;
        int arr[] = new int[nums.length];
        arr[0] = max;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);

            if (max != arr[i]) {
                arr[i] = gcd(nums[i], max);
            } else {
                arr[i] = max;
            }
        }

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            sum = sum + gcd(arr[i], arr[j]);
            i=i+1;
            j=j-1;
        }
        System.out.println(sum);

    }

    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    }

