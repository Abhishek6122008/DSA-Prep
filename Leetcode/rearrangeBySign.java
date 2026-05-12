package Leetcode;

public class rearrangeBySign {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int n = nums.length;
        int x = n/2;
        int[] poss = new int[x];
        int p = 0;
        int[] negg = new int[x];
        int ne = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]>0){
                poss[p]=nums[i];
                p++;
            }else{
                negg[ne]=nums[i];
                ne++;
            }
        }
        p = 0;
        ne = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0){
                nums[i] = poss[p];
                p++;
            } else {
                nums[i] = negg[ne];
                ne++;
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.println(nums[i]);
        }
    }
}
