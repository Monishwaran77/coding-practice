class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        for(int n : nums) {
            int r = n % 3;
            op += Math.min(r, 3 - r);
        }
        return op;
    }
}