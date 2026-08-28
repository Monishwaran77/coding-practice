class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] seen = new boolean[101];
        int cnt = 0;
        for (int n : nums) {
            if (n< k) {
                return -1;
            }
            if (n >k && !seen[n]) {
                seen[n] = true;
                cnt++;
            }
        }
        return cnt;
    }
}