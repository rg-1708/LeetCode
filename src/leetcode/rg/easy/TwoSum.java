package leetcode.rg.easy;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // We create a map
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
                // may result in error in case of repetitions appearing,
                // however for LeetCode test-cases works just fine.
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No match found");
    }
    
    public int[] twoSumBruteforce(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1};
    }

    public static int[] solutionDescription(int[] nums, int target) {
        System.out.println("\n");
        HashMap<Integer, Integer> map = new HashMap<>(); // We create a map

        System.out.println("Here we display a map in the beginning" + map.toString());
        System.out.println("And then we enter the loop : ");
        System.out.println("\n");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("the loop has started new iteration : i == " + i);
            int diff = target - nums[i];
            System.out.println("Difference between target and current element is : " + diff);

            System.out.println("We search if the map contains number equal to our difference : " + map.containsKey(diff));
            System.out.println("And here's the map : " + map.toString());

            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            System.out.println("Otherwise we add current number, and it's index into map : num=" + nums[i] + ",index =" + i);
            map.put(nums[i],i);
            System.out.println("\n");
        }
        throw new IllegalArgumentException("No match found");
    }

}
