package Kumar_K.MainCourse.TwoPointer;
//you're given 2 sorted arrays u need to find a
//pair of numbers such that the sum of numbers is
//<=x and as close as x
//two pointer algorithm will only work when there is exactly one option ahead
//so u can move in that direction towards that solution
public class Session2 {
    static void main(String[] args) {
        int[] a = {1,4,5,7};
        int[] b = {10,20,30,40};
        int n = a.length;
        int target = 32;
        //lets do it in a way such that we have only one option
        //put i = a0
        //put j = bn-1
        //if sum>target u decremenmt j
        int i = 0;
        int j = n-1;
        int v = 0;
        int first = 0;
        int second = 0;
        while (i < n && j >= 0) {
            if(a[i]+b[j]<=target){
                int sum = a[i]+b[j];
                if(sum>v){
                    first= a[i];
                    second= b[j];
                }
                i=i+1;
            }
            else{
                j=j-1;
            }
        }
        System.out.println(first+" "+second);
    }
}
