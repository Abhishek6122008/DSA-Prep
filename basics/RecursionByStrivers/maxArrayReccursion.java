package basics.RecursionByStrivers;

public class maxArrayReccursion {
    public static int max(int[]arr, int n){
        if(n==0)
            return arr[0];
        int max = Math.max(arr[n],max(arr,n-1));
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length-1;
        System.out.println(max(arr,n+1));
    }
}
