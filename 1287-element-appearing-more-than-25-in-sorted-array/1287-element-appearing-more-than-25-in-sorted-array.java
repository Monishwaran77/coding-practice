class Solution {
    public int findSpecialInteger(int[] arr) {
        int cnt =1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]==arr[i-1]){
                cnt++;
            }else{
                cnt=1;
            }
            if(cnt>arr.length/4){
                return arr[i];
            }
        }
        return arr[0];
    }
}