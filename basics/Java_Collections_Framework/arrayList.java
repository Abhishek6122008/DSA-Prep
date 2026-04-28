package basics.Java_Collections_Framework;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
//        String[] arr = new Array[31];
//        arr[0] = "Rakesh";
//        arr[29] = "Harish";
//        arr[30] = "Raman" ;
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Rakesh");
        arr.add("Paul");
        arr.add("Manish");

        arr.add(3,"dudu");
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.set(1,"momo");
        System.out.println(arr);
        System.out.println(arr.contains("momo"));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }
        for(String names:arr){
            System.out.println(names);
        }
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
