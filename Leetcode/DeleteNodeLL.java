package Leetcode;

public class DeleteNodeLL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void delete(String key) {
        // Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data.equals(key)) {
                prev.next = curr.next;
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Element not found");
    }
    public static void main(String[] args) {

    }

}
