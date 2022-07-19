package leetcode.rg.easy;

import java.util.*;

public class PlusOne {

    /*
        This one is a improvise on-spot solution, I think it can be more optimised.
        Yet, the results are :
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
        Memory Usage: 43.1 MB, less than 7.10% of Java online submissions for Plus One.
     */
    public static int[] plusOne(int[] digits) {

        int[] arr = new int[digits.length+1];
        digits[digits.length-1]++;
        for(int i = digits.length-1; i >= 0; i--){
            arr[i+1] = digits[i];
            if(digits[i] == 10){
                arr[i+1] = digits[i] = 0;
                if(i-1 < 0){
                    arr[0] = 1;
                    return arr;
                }
                digits[i -1]++;
            }
        }

        return digits;
    }
}
