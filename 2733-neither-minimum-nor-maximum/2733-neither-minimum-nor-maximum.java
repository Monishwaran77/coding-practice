class Solution {
    public int findNonMinOrMax(int[] nums) {
        int val=0;
        if(nums.length<=2){
            val =-1;
        }
        int min=Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int n:nums){
            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
        }
        for(int n:nums){
            if(n!=max&&n!=min){
                val=n;
            }
        }
        return val;
    }
}