package Kumar_K.MainCourse.Hashing;

// u are given an array of size n
// and two integers x and y
// array only consists of integers x and y
// find the count of subarrays which have equal number of x and y

// FOLLOW UP QUESTION
// instead of 2 now its 3 integers x y z
// now find subarrays which have equal nums of x y z
// cant use +1 and -1

import java.util.*;
// Soln
// Pattern is that
// C2(j)-C1(j) = C2(i-1)-C1(i-1)
// For 3 numbers we need
// (Cy-Cx) and (Cz-Cy)

public class Class28 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        long count = 0;
        // stores frequency of every (Cy-Cx , Cz-Cy)
        HashMap<Key,Integer> freq = new HashMap<>();
        // initially all counts are 0
        freq.put(new Key(0,0),1);
        int cx = 0;
        int cy = 0;
        int cz = 0;
        for(int i=0;i<n;i++){
            int val = scanner.nextInt();
            if(val==x) cx++;
            else if(val==y) cy++;
            else if(val==z) cz++;
            int d1 = cy-cx;
            int d2 = cz-cy;
            Key key = new Key(d1,d2);
            count += freq.getOrDefault(key,0);
            freq.put(key,freq.getOrDefault(key,0)+1);
        }
        System.out.println(count);
    }
    static class Key{
        int d1,d2;
        Key(int d1,int d2){
            this.d1=d1;
            this.d2=d2;
        }
        public boolean equals(Object obj){
            if(this==obj) return true;
            if(obj==null || getClass()!=obj.getClass()) return false;

            Key k=(Key)obj;

            return d1==k.d1 && d2==k.d2;
        }
        public int hashCode(){
            return 31*d1+d2;
        }
    }
}