package basics.RecursionByStrivers;

public class findFirstIndexofTarget {
    public static void firstIndx(int[] arr, int idx, int target) {
        if (idx == arr.length)
            return;
        if (arr[idx] == target)
            System.out.println(idx);;
        firstIndx(arr, idx + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 5, 7, 5, 9};
        int target = 5;
        firstIndx(arr,0,target);
    }
}
