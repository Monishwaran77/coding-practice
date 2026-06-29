class Solution {
    public int countPartitions(int[] nums) {
        int cnt = 0;
        int total =0;
        for(int n:nums){
            total+=n;
        }
        if(total%2==0){
            return nums.length-1;
        }else{
            return 0;
        }
    }
}