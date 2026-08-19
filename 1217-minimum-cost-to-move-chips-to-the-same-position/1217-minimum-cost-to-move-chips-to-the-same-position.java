class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,evn=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0)
                evn++;
            else
                odd++;
        }
        return Math.min(evn,odd);
    }
}