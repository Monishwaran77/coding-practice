class Solution {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        String base7 ="";
        int n=Math.abs(num);
        while(n>0){
            int d = n%7;
            base7=String.valueOf(d)+base7;
            n/=7;
        }
        return num>0 ? base7 : "-"+base7;
    }
}