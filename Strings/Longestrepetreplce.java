package Strings;
import java.util.*;
public class Longestrepetreplce {
    public static void main(String[] args) {
        String s = "ABAB";
        int occurences = 0, maxlen = 0,l = 0,k=2;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            occurences = Math.max(occurences,hm.get(ch));
            while((r-l+1)-occurences>k){
                char leftchar = s.charAt(l);
                hm.put(leftchar,hm.get(leftchar)-1);
                l++;
                occurences = Math.max(occurences,hm.get(leftchar));
            }
            maxlen = Math.max(maxlen,r-l+1);
        }  
        System.out.println(maxlen);
    }
}
