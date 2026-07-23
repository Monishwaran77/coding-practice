class Solution {
    public int balancedStringSplit(String s) {
        int cnt =0;
        int val=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                cnt++;
            }else if(s.charAt(i)=='L'){
                cnt--;
            }
            if(cnt==0){
                val++;
            }
        }
        return val;
    }
}