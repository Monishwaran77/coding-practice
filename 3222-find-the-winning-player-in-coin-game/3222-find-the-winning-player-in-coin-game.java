class Solution {
    public String winningPlayer(int x, int y) {
        int b = 0;
        while(x>=1 &&y>=4) {
            x--;
            y-=4;
            b++;
        }
        return (b%2== 0)? "Bob": "Alice" ;
    }
}