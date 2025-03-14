public class Best_Seat {
    public int bestSeat(int[] seats) {
        int finalAns = -1;
        if (seats.length == 0) {
            return finalAns;
        }
        if (seats.length == 1) {
            return seats[0] == 0 ? 0 : finalAns;
        }
        int count = 0, oldcount = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                int j = i;
                while (seats[j] == 0 && j < seats.length) {
                    j++;
                    count++;
                }
                int mid = (i + j - 1) / 2;
                if (oldcount < count) {
                    finalAns = mid;
                    oldcount = count;
                }
                count = 0;
                i = j - 1;
            }
        }
        return finalAns;
    }
}
