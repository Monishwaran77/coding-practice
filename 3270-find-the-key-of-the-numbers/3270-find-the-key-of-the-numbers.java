class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int d1 = Math.min(num1 / 1000, Math.min(num2 / 1000, num3 / 1000));
        int d2 = Math.min((num1 / 100)%10, Math.min((num2 / 100)%10, (num3 / 100)%10));
        int d3 = Math.min((num1 / 10)%10, Math.min((num2 / 10)%10, (num3 / 10)%10));
        int d4 = Math.min(num1%10 , Math.min(num2 % 10, num3 % 10));
        return d1*1000+d2*100+d3*10+d4;
    }
}