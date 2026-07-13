package Kumar_K.MainCourse.Hashing;

import java.util.HashMap;

public class Class21_Optimal {
    static int digitsum(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a = {51,71,17,42};
        HashMap<Integer,Integer> hs = new HashMap<>();
        int answer = -1;
        for(int i = 0; i < a.length; i++){
            int digitSum = digitsum(a[i]);

            if(hs.containsKey(digitSum)){
                answer = Math.max(answer, a[i] + hs.get(digitSum));
                hs.put(digitSum, Math.max(hs.get(digitSum), a[i]));
            } else {
                hs.put(digitSum, a[i]);
            }
        }
        System.out.println(answer);
    }
}