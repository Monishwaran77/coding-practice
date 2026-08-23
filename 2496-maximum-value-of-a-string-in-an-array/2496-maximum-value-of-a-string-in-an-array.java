class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(int i=0;i<strs.length;i++){
            boolean flag = true;
            for (int j=0;j<strs[i].length();j++) {
                if(!Character.isDigit(strs[i].charAt(j))) {
                    flag=false;
                    break;
                }
            }
            int value;
            if (flag) {
                value=Integer.parseInt(strs[i]);
            }else {
                value=strs[i].length();
            }
            if(value > max) {
                max=value;
            }
        }
        return max;
    }
}