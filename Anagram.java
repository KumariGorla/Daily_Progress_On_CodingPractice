import java.util.*;
class Anagram {
    public static boolean fun(HashMap<Character,Integer> hma,HashMap<Character,Integer> hmb){
        if(hma.size()!=hmb.size()) return false;
        for(char key:hma.keySet()){
            if(!hmb.containsKey(key)) return false;
            int a = hma.get(key);
            int b = hmb.get(key);
            if(a!=b) return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abcdd";
        String s2 = "bdcda";
        HashMap<Character,Integer> hma = new HashMap<>();
        HashMap<Character,Integer> hmb = new  HashMap<>();
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hma.put(ch,hma.getOrDefault(ch,0)+1);
        }
        for(int j = 0;j<s2.length();j++){
            char ch1 = s2.charAt(j);
            hmb.put(ch1,hmb.getOrDefault(ch1,0)+1);
        }
        boolean res = fun(hma,hmb);
        System.out.println(res);
        
    }
}