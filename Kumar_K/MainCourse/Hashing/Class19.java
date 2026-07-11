package Kumar_K.MainCourse.Hashing;
//Kadane's Algorigthm
// p1[i] = maximum sum of subarray ending at index i
public class Class19 {
    public static void main(String[] args) {
        int[] B = {5,8,10,2,5,5};
        int n = B.length;
        int[] p1 = new int[n];
//        NON OPTIMISED
//        for (int i = 1; i <n; i++) {
//            int sum = 0;
//            int maxSum = 0;
//            for (int j = i; j >=1; j--) {
//                sum = sum + B[j]; //sum of the subarray = j.....i
//                maxSum = Math.max(maxSum,sum);
//            }
//            p1[i] = maxSum;
//        }
        int p = B[0];
        int ans = B[0];
        for (int i = 1; i < n; i++) {
            int current = Math.max(p + B[i], B[i]);
            p = current;
            ans = Math.max(ans, p);
        }
        System.out.println(ans);
    }
}
