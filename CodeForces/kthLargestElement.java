public class kthLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,4,5,6,5,4,7,8,3};
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        int k = 4;
        System.out.println(arr[4]);
    }
}
