package Leetcode;


class ListNode1 {
      int val;
      removeNth next;
      ListNode1(int x) {
          val = x;
          next = null;
      }
}

public class linkcycle2 {
    public removeNth detectCycle(removeNth head) {
        removeNth tortoise = head;
        removeNth rabbit = head;
        while (rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;

            if (tortoise == rabbit) {

                removeNth ptr1 = head;
                removeNth ptr2 = tortoise;
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