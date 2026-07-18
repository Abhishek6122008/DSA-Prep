package Kumar_K.MainCourse.DP;
//2 arrays a b given
//find how many jhourneys to go from start till end such that their sum is even

public class Session12 {
    static void main(String[] args) {
        int[] a =  {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] dpaeven = new int[a.length+1];
        int[] dpbeven = new int[a.length+1];
        int[] dpaodd = new int[a.length+1];
        int[] dpbodd = new int[a.length+1];
        int n = a.length;
        dpaeven[0] = (a[1] % 2 == 0) ? 1 : 0;
        dpaodd[0] = (a[1] % 2 != 0) ? 1 : 0;
        dpbeven[0] = (b[1] % 2 == 0) ? 1 : 0;
        dpbodd[0] = (b[1] % 2 != 0) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (a[i] % 2 == 0) {
                dpaeven[i] = dpaeven[i - 1] + dpbeven[i - 1];
                dpaodd[i] = dpaodd[i - 1] + dpbodd[i - 1];
            } else {
                dpaeven[i] = dpaodd[i - 1] + dpbodd[i - 1];
                dpaodd[i] = dpaeven[i - 1] + dpbeven[i - 1];
            }

            if (b[i] % 2 == 0) {
                dpbeven[i] = dpbeven[i - 1] + dpaeven[i - 1];
                dpbodd[i] = dpbodd[i - 1] + dpaodd[i - 1];
            } else {
                dpbeven[i] = dpbodd[i - 1] + dpaodd[i - 1];
                dpbodd[i] = dpbeven[i - 1] + dpaeven[i - 1];
            }
        }
        long total_even = dpaeven[n] + dpbeven[n];
        long total_odd = dpaodd[n] + dpbodd[n];
        System.out.println("Even Journeys: " + total_even);
        System.out.println("Odd Journeys: " + total_odd);
    }
}
