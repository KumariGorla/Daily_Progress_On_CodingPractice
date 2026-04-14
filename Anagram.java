import java.util.*;

class Anagram {
    public List<Integer> findAnagrams(String s, String p) {
        
        HashMap<Character,Integer> hmp = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch, 0) + 1);
        }

        int l = 0;
        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> hms = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            hms.put(ch, hms.getOrDefault(ch, 0) + 1);

            // When window size matches pattern length
            if(r - l + 1 == k){
                // Check equality first
                if(hms.equals(hmp)){
                    ans.add(l);
                }

                // Then shrink window
                char tch = s.charAt(l);
                hms.put(tch, hms.get(tch) - 1);
                if(hms.get(tch) == 0){
                    hms.remove(tch);
                }
                l++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = anagram.findAnagrams(s, p);
        System.out.println(result); // Output: [0, 6]
    }
}