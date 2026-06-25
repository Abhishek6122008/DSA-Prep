package Leetcode;

public class ListNode213 {
    int val;
    ListNode213 next;
    ListNode213() {}
    ListNode213(int val) {
        this.val = val;
    }
    ListNode213(int val, ListNode213 next) {
        this.val = val;
        this.next = next;
    }
    public ListNode213 oddEvenList(ListNode213 head) {
        if (head == null || head.next == null) return head;
        ListNode213 odd = head;
        ListNode213 oddhead = head;
        ListNode213 even = head.next;
        ListNode213 evenhead = even;
        ListNode213 evenStart = even;
        while (even != null && even.next != null) {
            odd = odd.next.next;
            oddhead.next = odd;
            oddhead = odd;

            even = even.next.next;
            evenhead.next = even;
            evenhead = even;
        }
        oddhead.next = evenStart;
        return head;
    }
    public static void main(String[] args) {
        ListNode213 obj = new ListNode213();
        ListNode213 head = new ListNode213(1);
        head.next = new ListNode213(2);
        head.next.next = new ListNode213(3);
        head.next.next.next = new ListNode213(4);
        head.next.next.next.next = new ListNode213(5);
        ListNode213 result = obj.oddEvenList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}