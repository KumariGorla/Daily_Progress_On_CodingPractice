import java.util.*;
public class Leetcode904 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,1};
        int ans = 0;
        int l = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int r = 0;r<arr.length;r++){
            int val = arr[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>2){
                int lval = arr[l];
                hm.put(lval,hm.get(lval)-1);
                if(hm.get(lval)==0){
                    hm.remove(lval);
                }
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        
        System.out.println(ans);
        
        
        
    }
}