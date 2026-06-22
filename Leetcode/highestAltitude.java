package Leetcode;

public class highestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int n = gain.length;
        if(n==1){
            System.out.println(gain[0]);
        }
        int[] altitude = new int[n+1];
        altitude[0]=0;
        int maxalti = 0;
        for (int i = 1; i <n+1; i++) {
            altitude[i] = altitude[i-1]+gain[i-1];
            maxalti = Math.max(maxalti,altitude[i]);
        }
        System.out.println(maxalti);
    }
}
