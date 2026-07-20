package Kumar_K.MainCourse.DP;

import java.util.Arrays;

//array of cost is given
//always at index 0
//u can make 2 jump forward or 1 backward
//u gotta add cost for 1 index
//u can only get to index for one time V IMMPORTANTTTTT
//so u cant do 2 back jumps!!!!
//
public class Session17 {
    static void main(String[] args) {
        int[] arr = {2,10,8,5,10010,5};
        int n = arr.length;
        int[] dp = new int[n];
        int INF = 100000000;
        //i got it!!! so what we do is compare the two jumps one is +2 and other is
        //+1 for which we need to do -1 and then +2
        // for that we need to compare this a[i+1]+a[i-1] vs a[i+2]
        //nvm i was wrong ;-;
        int[] forward = new int[n];
        int[] backward = new int[n];
        Arrays.fill(forward, INF);
        Arrays.fill(backward, INF);
        forward[0] = arr[0];
        if(n > 1)
            backward[1] = forward[0] + arr[1] + arr[2];
        for(int i = 2; i < n-1; i++){
            forward[i] = arr[i] + Math.min(forward[i-2], backward[i-2]);
            backward[i] = arr[i] + arr[i+1] + forward[i-1];
        }
        if(n > 2){
            forward[n-1] = arr[n-1] + Math.min(forward[n-3], backward[n-3]);
            backward[n-1] = INF;
        }
        int ans = Math.min(forward[n-1], Math.min(forward[n-2], backward[n-2]));
        System.out.println(ans);
    }
}
