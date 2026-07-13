class Solution {
    public int missingMultiple(int[] nums, int k) {
        int res = k;
        while(true){
            boolean fnd = false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==res){
                    fnd=true;
                    break;
                }
            }
            if(!fnd){
                    return res;
                }
                res+=k;
        }
    }
}