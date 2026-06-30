package basics.RecursionByStrivers;

public class printArrayUsingReccursion {
    public static void print(int[] arr,int n){
        if(n==0) { System.out.println(arr[n]);
            return;}
        System.out.println(arr[n]);
        print(arr, n-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length-1;
        print(arr,n);
    }
}
