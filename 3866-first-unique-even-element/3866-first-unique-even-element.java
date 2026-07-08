class Solution {
    public int firstUniqueEven(int[] nums) {
        boolean arr[]=new boolean[nums.length];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    arr[i]=true;
                    arr[j]=true;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 ==0 && !arr[i]){
                return nums[i];
            }
        }
        return -1;
    }
}