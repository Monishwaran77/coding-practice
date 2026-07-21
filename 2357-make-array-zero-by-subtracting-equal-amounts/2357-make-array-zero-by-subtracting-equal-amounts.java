class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] seen = new boolean[101];
        int cnt = 0;
        for (int num : nums) {
            if (num != 0 && !seen[num]) {
                seen[num] = true;
                cnt++;
            }
        }
        return cnt;
    }
}