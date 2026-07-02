class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val =0;
        for(String s :operations){
            if(s.contains("++")){
                val+=1;
            }
            if(s.contains("--")){
                val-=1;
            }
        }
        return val;
    }
}