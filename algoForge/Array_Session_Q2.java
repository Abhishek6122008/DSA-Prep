package algoForge;

public class Array_Session_Q2 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        k = k % arr.length;
        for(int i = 0; i < k; i++) {
            int end = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = end;
        }
        for (int q = 0; q <arr.length; q++) {
            System.out.println(arr[q]);
        }
    }
}
