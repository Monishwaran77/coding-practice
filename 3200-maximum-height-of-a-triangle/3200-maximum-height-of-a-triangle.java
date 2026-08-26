class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int val1 = calc(red, blue);
        int val2 = calc(blue, red);
        return Math.max(val1, val2);
    }
    private int calc(int first, int second) {
        int row = 1;
        while (true) {
            if (row % 2 == 1) {
                if (first < row) {
                    break;
                }
                first -= row;
            } else {
                if (second < row) {
                    break;
                }
                second -= row;
            }
            row++;
        }
        return row - 1;
    }
}