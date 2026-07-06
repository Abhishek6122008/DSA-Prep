package Kumar_K.Recurrsion;

//we will always have a branch
//we start from the top of the branch
//we travel the branch from top to bottom
//once we reach the bottom we again travel in the upper direction
//whenever we are going down a branch it means we are exploring
//whenever we are going up it means we have collected the final answer
//and now we are trying to send the final answer to the top
public class Recurrsion {
    public static int f(int x){
        if(x==0){
            return 0;
        }
        return x+(f(x-1));
    }
    public static void main(String[] args) {
        System.out.println(f(10));
    }
}
