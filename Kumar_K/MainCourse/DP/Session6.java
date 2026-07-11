package Kumar_K.MainCourse.DP;
//largest valid substring ending at i

import java.util.Scanner;

public class Session6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read n
        int k = sc.nextInt();  // Read k
        sc.nextLine();  // Consume newline after integers
        String s = sc.nextLine();  // Read the input string
        int[] dp = new int[n];
        dp[0] = 1;  // The first character is always a valid substring of length 1
        int maxLen = 1;  // The maximum length of valid substring
        int maxIndex = 0;  // The index where the maximum valid substring ends
        // Fill the dp array
        for (int i = 1; i < n; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) <= k) {
                dp[i] = dp[i - 1] + 1;  // Extend the valid substring
            } else {
                dp[i] = 1;  // Start a new valid substring
            }
            // Update maxLen and maxIndex if a longer valid substring is found
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }
        // Get the start index of the largest valid substring
        int startIndex = maxIndex - maxLen + 1;
        // Print the largest valid substring
        System.out.println(s.substring(startIndex, startIndex + maxLen));
        sc.close();
    }
}
