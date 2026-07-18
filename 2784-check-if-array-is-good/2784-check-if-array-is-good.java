import java.util.Arrays;
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int v=nums[nums.length-1];
        if(nums.length!= v+1) {
            return false;
        }
        if(!check(nums,v)) {
            return false;
        }
        for (int i = 0; i < v - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return true;
        
    }
    private boolean check(int[] nums,int n){
        return nums[nums.length - 1] == n && nums[nums.length - 2] == n;
    }
}