package org.example.think;

public class june30 {
    public static void main(String[] args) {
        String s="aaacbba";
        int[] freq = new int[3];

        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                count += s.length() - right;

                freq[s.charAt(left) - 'a']--;

                left++;
            }
        }
        System.out.println(count);

    }
}
