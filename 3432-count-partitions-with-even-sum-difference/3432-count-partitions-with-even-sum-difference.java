class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        int cnt = 0;
        int rightcnt = 0;
        int leftcnt=0;
        for(int n:nums){
            total+=n;
        }
        for(int i =0;i<nums.length-1;i++){
            leftcnt+=nums[i];
            rightcnt=total-leftcnt;
            if((leftcnt-rightcnt)%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}