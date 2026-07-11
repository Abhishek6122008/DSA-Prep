package Kumar_K.MainCourse.Hashing;
import java.util.HashMap;
//find the prefix common array of two arrays
//bruteforce put i indexing in a array and j in b and for each i try to find b[j]
//as per question's constrains we can only check similar elements at i or before
//optimal hashing store frequency of elements from both arrays
//whenever frequency becomes 2 it means element has appeared once in a and once in b
//increase common count and store it in output
public class Class17 {
    public static void main(String[] args) {
        int[]a={1,3,2,4};
        int[]b={3,1,2,4};
        //Output : [0,2,3,4]
        int n=a.length;
        int[]output=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        int common=0;
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(map.get(a[i])==2){
                common++;
            }
            map.put(b[i],map.getOrDefault(b[i],0)+1);
            if(map.get(b[i])==2){
                common++;
            }
            output[i]=common;
        }
        for(int x:output){
            System.out.print(x+" ");
        }
    }
}