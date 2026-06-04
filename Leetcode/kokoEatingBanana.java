package Leetcode;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        int minSpeed = 1;
        int maxSpeed = 0;
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }
        int answer = maxSpeed;
        while (minSpeed <= maxSpeed) {
            int speed = minSpeed + (maxSpeed - minSpeed) / 2;
            long totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + speed - 1) / speed;
            }
            if (totalHours <= h) {
                answer = speed;
                maxSpeed = speed - 1;
            } else {
                minSpeed = speed + 1;
            }
        }
        System.out.println(answer);
    }
}
