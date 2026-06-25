package Leetcode;

public class ListNode {
    int val;
    removeNth next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, removeNth next) {
        this.val = val;
        this.next = next;
    }
}