package Leetcode;


class ListNode1 {
      int val;
      ListNode next;
      ListNode1(int x) {
          val = x;
          next = null;
      }
}

public class linkcycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode rabbit = head;
        while (rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;

            if (tortoise == rabbit) {

                ListNode ptr1 = head;
                ListNode ptr2 = tortoise;
                while (ptr1 != ptr2) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1;
            }
        }
        return null;
    }
}