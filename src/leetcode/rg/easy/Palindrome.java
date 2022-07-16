package leetcode.rg.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public boolean isPalindrome(int x) {
        if(x < 0) {return false;}
        List<Integer> numbers = new ArrayList<>();
        for(; x > 0; x/=10){ numbers.add(x % 10); }
        for(int i = 0, j = numbers.size() - 1; i < numbers.size() && j >= 0; i++,j--){
            if(!numbers.get(i).equals(numbers.get(j))) {return false;}
        }
        return true;
    }
}
