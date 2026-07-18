package Kumar_K.MainCourse.DP;
//person can do 3 activities for ai bi ci happyness
//greedy uk that at each step u get best answer for now and future
//if udk about future then u need to use dp
public class Session10 {
    static void main(String[] args) {
        /*
        Easier Version of the Question
        given 3 vertical arrays a b c till ai bi ci u have to select 1 out of each
        their sum have to be max as possible
        Solution of Easier Version
        You chose the max
                int n =  5;
                int[] a = {1,2,3,4,5};
                int[] b = {4,3,7,3,2};
                int[] c = {7,4,3,7,2};
                int sum = 0;
                int i = 0;
                while (i<=n-1){
                    sum += Math.max(a[i],Math.max(b[i],c[i]));
                    i++;
                }
                System.out.println(sum);
        */
        //Harder Version
        //You cannot select a number from a paticular array for more than 1 time consecutively
        int n =  5;
        int[] a = {1,2,3,4,5};
        int[] b = {4,3,7,3,2};
        int[] c = {7,4,3,7,2};
        int[] dpa = new int[n];
        int[] dpb = new int[n];
        int[] dpc = new int[n];
        dpa[0] = a[0];
        dpb[0] = b[0];
        dpc[0] = c[0];
        for (int i = 1; i <n; i++) {
            dpa[i] = a[i]+Math.max(dpb[i-1],dpc[i-1]);
            dpb[i] = b[i]+Math.max(dpa[i-1],dpc[i-1]);
            dpc[i] = c[i]+Math.max(dpa[i-1],dpb[i-1]);
        }
        int ans = Math.max(dpa[n-1],Math.max(dpb[n-1],dpc[n-1]));
        System.out.println(ans);
    }
}
