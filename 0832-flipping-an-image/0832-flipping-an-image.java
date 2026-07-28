class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            int k=0;
            for(int j=image[i].length-1;j>=0;j--){
                if (image[i][j]==0)
                    res[i][k++]=1;
                else
                    res[i][k++]=0;
            }
        }
        return res;
    }
}