import java.util.Arrays;

class Solution {
    public int fillCups(int[] amount) {

        int time = 0;

        while (amount[0] != 0 || amount[1] != 0 || amount[2] != 0) {

            Arrays.sort(amount);

            if (amount[2] > 0)
                amount[2]--;

            if (amount[1] > 0)
                amount[1]--;

            time++;
        }

        return time;
    }
}