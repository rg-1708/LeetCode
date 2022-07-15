package leetcode.rg.easy;

public class TwoSum {


    // I've decided, to go with basic bruteforce approach,
    // rather than HashMap for this problem.

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[] {-1};
    }
}
