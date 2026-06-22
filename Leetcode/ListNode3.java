package Leetcode;

public class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3() {}
    ListNode3(int val) {
        this.val = val;
    }
    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}
class listPalindrome {
    public boolean isPalindrome(ListNode3 head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode3 tortoise = head;
        ListNode3 rabbit = head;
        while(rabbit.next!=null&&rabbit.next.next!=null){
            rabbit = rabbit.next.next;
            tortoise = tortoise.next;
        }
        if (rabbit != null) {
            tortoise = tortoise.next;
        }
        ListNode3 prev = null;
        ListNode3 curr = head;
        while (curr !=tortoise){
            ListNode3 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev!=null&&tortoise!=null){
            if(prev.val!=tortoise.val){
                return false;
            }
            prev = prev.next;
            tortoise = tortoise.next;
        }
        return true;
    }
}