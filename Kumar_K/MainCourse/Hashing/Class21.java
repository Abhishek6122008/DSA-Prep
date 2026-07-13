package Kumar_K.MainCourse.Hashing;
//given an array A n ints return max of two pairs whos sum is equal;
public class Class21 {

    static int digitsum(int number){
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }//TC = O(digit size)

    public static void main(String[] args) {
        int[] a = {51,71,17,42};
        int n = a.length;
        int answer = -1;
        for(int i = 0; i < n; i++){
            for(int j = i - 1; j >= 0; j--){
                if(digitsum(a[j]) == digitsum(a[i])){
                    int sum = a[j] + a[i];
                    answer = Math.max(answer, sum);
                }
            }
        }//O(n^2+digit size)
        System.out.println(answer);
    }
}