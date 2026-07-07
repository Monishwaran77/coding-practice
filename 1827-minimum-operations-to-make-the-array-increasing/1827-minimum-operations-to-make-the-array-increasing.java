class Solution {
    public int minOperations(int[] nums) {
         int op = 0;
        for (int i = 1;i <nums.length;i++) {
            if (nums[i]<= nums[i-1]) {
                int req = nums[i-1]+1;
                op += req - nums[i];
                nums[i] = req;
            }
        }
        return op;
    }
}