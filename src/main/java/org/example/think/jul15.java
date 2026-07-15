package org.example.think;

public class jul15 {
    public static void main(String[] args) {
        int n=4;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            oddSum += (2 * i - 1);
            evenSum += (2 * i);
        }

        System.out.println(gcd(oddSum,evenSum));
    }

    public  static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
