package algoForge;

public class Array_Session_Q1 {
    static void main(String[] args) {
        int[] arr = {10,9,3,7,11};
        int temp = 0;
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i <arr.length; i++) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            if(end<=start){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}