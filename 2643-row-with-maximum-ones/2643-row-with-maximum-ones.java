class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max =0;
        int row =0;
        for(int i=0;i<mat.length;i++){
            int val=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    val++;
                }
            }
            if(val>max){
                max=val;
                row=i;
            }
        }
        return new int[]{row,max};
    }
}