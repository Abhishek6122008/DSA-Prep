package Leetcode;
public class ListNode2095 {
    int val;
    ListNode2095 next;
    ListNode2095() {}
    ListNode2095(int val) { this.val = val; }
    ListNode2095(int val, ListNode2095 next) { this.val = val; this.next = next; }
}

class Solution12 {
    public ListNode2095 deleteMiddle(ListNode2095 head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode2095 rabbit = head;
        ListNode2095 turtle = head;
        while(rabbit != null && rabbit.next != null){
            rabbit=rabbit.next.next;
            turtle= turtle.next;
        }
        ListNode2095 turtlehead = head;
        while (turtlehead.next != turtle) {
            turtlehead = turtlehead.next;
        }
        turtlehead.next = turtle.next;
        return head;
    }
}