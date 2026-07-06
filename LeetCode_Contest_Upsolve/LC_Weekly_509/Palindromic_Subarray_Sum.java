package LeetCode_Contest_Upsolve.LC_Weekly_509;

import java.util.*;

public class Palindromic_Subarray_Sum{
    public static void main(String[] args){
        //Bruteforce itterate all subarray for each subarray again check if it is a palendrome or not
        // if it is a palendrome then check its sum
        //optimisation1 O(n^2) subarray DP :- dp[i][j] == true[i.....j] is a palindrome.
        //final optimisation is Manachar's Algorithm
        //d_off[i] largest palendrome whose middle character is 'i'
        //manacher algo can also tell u total numbers of palendrome subarray within the array
    }
    static long[] manacherOdd(ArrayList<Long> t){
        int n=t.size();
        t.add(-1000000000000000000L);
        t.add(0,1000000000000000000L);
        long[] p=new long[n+2];
        int l=0,r=1;
        for(int i=1;i<=n;i++){
            if(i<=r){
                p[i]=Math.min(r-i,p[l+(r-i)]);
            }
            while(t.get((int)(i-p[i])).equals(t.get((int)(i+p[i])))){
                p[i]++;
            }
            if(i+p[i]>r){
                l=(int)(i-p[i]);
                r=(int)(i+p[i]);
            }
        }
        return Arrays.copyOfRange(p,1,n+1);
    }
    static long[] manacher(int[] s){
        ArrayList<Long> t=new ArrayList<>();
        for(int c:s){
            t.add(0L);
            t.add((long)c);
        }
        t.add(0L);
        long[] res=manacherOdd(t);
        return Arrays.copyOfRange(res,1,res.length);
    }
    public long getSum(int[] s){
        long[] p=manacher(s);
        ArrayList<Long> u=new ArrayList<>();
        for(int c:s){
            u.add(0L);
            u.add((long)c);
        }
        u.add(0L);
        int d=u.size();
        long[] prefix=new long[d+5];
        for(int i=1;i<=d-1;i++){
            prefix[i]=prefix[i-1]+u.get(i);
        }
        long maxSum=0;
        int j=1;
        for(int i=0;i<p.length;i++){
            long left=j-p[i]+1;
            long right=j+p[i]-1;
            long answer=prefix[(int)right];
            if(left>0){
                answer-=prefix[(int)left-1];
            }
            maxSum=Math.max(maxSum,answer);
            j++;
        }
        return maxSum;
    }
}