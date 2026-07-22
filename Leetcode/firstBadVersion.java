package Leetcode;

public class firstBadVersion {
    static boolean isBadVersion(int version){
        if(version==4) return true;
        if(version==5) return true;
        return false;
    }
    static void main(String[] args) {
        int n = 5;
        int start = 0;
        int end = n;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if(isBadVersion(mid)==false){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        System.out.println(start);
    }
}
