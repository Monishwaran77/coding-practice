class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] freq=new int[grid.length*grid.length+1];
        for (int i=0;i<grid.length;i++) {
            for (int j= 0;j<grid.length;j++) {
                freq[grid[i][j]]++;
            }
        }
        int a=0,b=0;
        for(int i=0;i<=grid.length*grid.length;i++){
            if(freq[i]==2)
                a=i;
            if(freq[i]==0)
                b=i;
        }
        return new int[]{a,b};
    }
}