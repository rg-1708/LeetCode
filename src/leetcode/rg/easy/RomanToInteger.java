package leetcode.rg.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('M', 1000); map.put('D', 500); map.put('C', 100);
        map.put('L', 50); map.put('X', 10); map.put('V', 5); map.put('I', 1);
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int valA = map.get(s.charAt(i));
            if(valA!= 1000 && i + 1 < s.length()){
                int valB = map.get(s.charAt(i + 1));
                if(valA < valB){
                    sum += valB - valA;
                    i++;
                    continue;
                }
            }
            sum += valA;
        }
        return sum;

        /*
            Runtime: 5 ms, faster than 93.74% of Java online submissions for Roman to Integer.
            Memory Usage: 42.7 MB, less than 89.04% of Java online submissions for Roman to Integer.
         */
    }


}
