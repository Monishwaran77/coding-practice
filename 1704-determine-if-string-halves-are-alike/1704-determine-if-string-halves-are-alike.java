class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int cnt=0;
        for(int i=0;i<s.length()/2;i++){
            if(Isvowel(s.charAt(i))){
                cnt++;
            }
            if(Isvowel(s.charAt(s.length()/2+i))){
                cnt--;
            }
        }
        return cnt==0;
    }
    private boolean Isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}