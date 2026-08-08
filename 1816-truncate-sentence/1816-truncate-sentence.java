class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr= s.split(" ");
        String res=arr[0];
        for(int i=1;i<k;i++){
            res+=(" "+arr[i]);
        }
        return res;
    }
}