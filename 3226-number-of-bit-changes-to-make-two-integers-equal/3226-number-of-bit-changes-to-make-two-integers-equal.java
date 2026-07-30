class Solution {
    public int minChanges(int n, int k) {
        String ns = Integer.toBinaryString(n);
        String ks = Integer.toBinaryString(k);
        int cnt =0;
        int max =Math.max(ns.length(),ks.length());
        while(ns.length()<max)
            ns = "0"+ns;
        while(ks.length()<max)
            ks = "0"+ks;
        for(int i=0;i<ns.length();i++){
            if (ns.charAt(i) == ks.charAt(i))
                continue;
            if (ns.charAt(i) == '1'&&ks.charAt(i)=='0')
                cnt++;
            else
                return -1;
        }
        return cnt;
    }
}