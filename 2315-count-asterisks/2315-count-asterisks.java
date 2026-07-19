class Solution {
    public int countAsterisks(String s) {
        int cnt =0;
        boolean inside = false;
        for(char c : s.toCharArray()){
            if(c =='|'){
                inside = !inside;
            }else if(c=='*'&&!inside){
                cnt++;
            }
        }
        return cnt;
    }
}