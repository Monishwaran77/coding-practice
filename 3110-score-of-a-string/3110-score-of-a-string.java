class Solution {
    public int scoreOfString(String s) {
        int result=0;
        for(int i=0;i<s.length()-1;i++){
            int ch1 = (int) s.charAt(i);
            int ch2 = (int) s.charAt(i+1);
            result+=Math.abs(ch1-ch2);
        }
        return result;
    }
}