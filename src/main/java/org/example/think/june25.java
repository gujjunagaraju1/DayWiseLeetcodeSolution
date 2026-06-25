package org.example.think;

public class june25 {
    public static void main(String[] args) {
        int arr[]={1,1,1,1};
        int target=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            if(arr[i]==target){
                c++;
                count++;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==target){
                    c++;
                }
                if(c>((j-i+1)/2)){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
