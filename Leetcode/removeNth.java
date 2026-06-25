package Leetcode;
public class removeNth {
    int val;
    removeNth next;
    removeNth() {}
    removeNth(int val) { this.val = val; }
    removeNth(int val, removeNth next) { this.val = val; this.next = next; }
}

class removeNth1 {
    public removeNth removeNthFromEnd(removeNth head, int n) {
        if(head == null || head.next == null){
            return head;
        }
        removeNth length = head;
        int count = 0;
        while (length!=null){
            count++;
            length = length.next;
        }
        int pos = count-n;
        removeNth pointertail = head.next;
        removeNth pointerhead = head;
        int pos1 = 0;
        while (pointertail != null && pointertail.next != null){
            if(pos1==pos){
                pointertail = pointertail.next;
                pointerhead = pointertail;
            }else{
                pointertail = pointertail.next;
                pointerhead = pointerhead.next;
            }
            pos1++;
        }
        return head;
    }
}