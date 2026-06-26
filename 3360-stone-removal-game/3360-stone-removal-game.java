class Solution {
    public boolean canAliceWin(int n) {
        int remove =10;
        boolean Aturn = true;
        while(remove>0){
            if(n<remove){
                return !Aturn;
            }
            n-=remove;
            remove--;
            Aturn = !Aturn;
        }
        return false;
    }
}