


package Leetcode;
public class EarlistFinishTime {
    public static void main(String[] args) {
        int[] landStartTime = {2, 8};
        int[] landDuration = {4, 1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};
        int n = landDuration.length;
        int m = waterDuration.length;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < m; j++) {
                int startWater = Math.max(landFinish, waterStartTime[j]);
                int finishTime = startWater + waterDuration[j];
                answer = Math.min(answer, finishTime);
            }
        }
        for (int i = 0; i < m; i++) {
            int waterFinish = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < n; j++) {
                int startLand = Math.max(waterFinish, landStartTime[j]);
                int finishTime = startLand + landDuration[j];
                answer = Math.min(answer, finishTime);
            }
        }
        System.out.println(answer);
    }
}