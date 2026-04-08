package Strings;

import java.util.*;
class longestcomprefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight","flinstone"};
        int maxlen = 0;
        String prev = arr[0];
        for(int i = 0;i<arr.length;i++){
            
            String temp = arr[i];
            while(temp.indexOf(prev)!=0){
                prev = prev.substring(0,prev.length()-1);
            }
            maxlen = prev.length();
        }
        System.out.println(prev);
        System.out.println(maxlen);
        
    }
}
