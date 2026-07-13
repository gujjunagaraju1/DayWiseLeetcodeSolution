package org.example.think;

import java.util.ArrayList;
import java.util.List;

public class jul13 {
    public static void main(String[] args) {
        List<Integer> answer=Optimize(100,1000);
        System.out.println(answer);
        //brute force
        List<Integer> value = new ArrayList<>();
        for (int i = 1000; i < 13000; i++) {


            int k = i / 10;
            int m = i % 10;
            while (k % 10 != 0) {
                int n = k % 10;
                if (m - 1 == n) {
                    m = n;
                    k = k / 10;
                } else {
                    break;
                }


            }
            if (k == 0) {
                value.add(i);

            }

        }
        System.out.println(value);
    }
    public static List<Integer> Optimize(int low,int high){
        List<Integer> value=new ArrayList<>();
        String answer="123456789";
        int start=String.valueOf(low).length();
        int end=String.valueOf(high).length();
        for(int i=start;i<=end;i++){
            for(int j=0;j+i<=9;j++){
                int num=Integer.parseInt(answer.substring(j,j+i));
                if(num>=low && num<=high){
                    value.add(num);
                }
                if(num>high){
                    break;
                }
            }
        }



        return value;
    }
}
