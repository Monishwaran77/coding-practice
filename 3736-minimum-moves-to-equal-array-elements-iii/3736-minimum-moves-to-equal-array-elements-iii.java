class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cnt =0;
        for(int n:nums){
            if(n>max){
                max=n;
            }
        }
        for(int n:nums){
            cnt += (max-n);
        }
        return cnt;
    }
}