package org.example;

import java.util.HashMap;
import java.util.Map;

public class june22 {
    public static void main(String[] args) {
        String text="ballon";
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
        System.out.println(result);
    }
}
