class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                s.append('x');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                s.append('x');
            }
            s.append('y');
        }
        return s.toString();
    }
}