package basics.Java_Collections_Framework;

import java.util.Stack;

public class arrayStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Gorilla");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}
