package org.example;

import java.util.HashMap;
import java.util.Map;

public class june22 {
    public static void main(String[] args) {
        String text="ballon";
        int sol1=solution1(text);
        System.out.println(sol1);
        System.out.println(solution2(text));

    }
    static int solution1(String text){
        int result=Integer.MAX_VALUE;
        HashMap<Character,Integer> value=new HashMap<>();
        value.put('b',0);
        value.put('a',0);
        value.put('l',0);
        value.put('o',0);
        value.put('n',0);
        for(char c: text.toCharArray()){
            if(value.containsKey(c)){
                value.put(c,value.get(c)+1);
            }
        }
        for(Map.Entry<Character,Integer> map:value.entrySet()){
            if(map.getKey()=='l' || map.getKey()=='o'){
                int output=(map.getValue()/2);
                result=Math.min(output,result);
            }
            else{
                result=Math.min(result,map.getValue());
            }
        }
        return result;
    }
    static int solution2(String text) {
        int arr[] = new int[26];
        for (char c : text.toCharArray()) {
            arr[c - 'a']++;
        }
        return Math.min(
                Math.min(arr['b' - 'a'], arr['a' - 'a']),
                Math.min(
                        Math.min(arr['l' - 'a'] / 2, arr['o' - 'a'] / 2),
                        arr['n' - 'a']
                )
        );
    }


    
}
