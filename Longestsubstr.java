import java.util.*;

public class Longestsubstr {
    public static void main(String[] args) {
        String s = "pwwkew";
        int maxlen = 0;
        int l = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            if(!hs.contains(ch)){
                hs.add(ch);
            }else{
                while(hs.contains(ch)){
                    hs.remove(s.charAt(l));
                    l++;
                }
            }
            maxlen = Math.max(maxlen,r-l);
        }
        System.out.println(maxlen);
    }
}