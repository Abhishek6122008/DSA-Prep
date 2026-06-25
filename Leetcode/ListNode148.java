package Leetcode;

class Node12 {
    int data;
    Node12 next;

    Node12(int d) {
        data = d;
        next = null;
    }
}

class solution12 {
    public Node12 segregate(Node12 head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node12 zeroHead = new Node12(-1);
        Node12 oneHead = new Node12(-1);
        Node12 twoHead = new Node12(-1);
        Node12 zero = zeroHead;
        Node12 one = oneHead;
        Node12 two = twoHead;
        Node12 curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;

                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
}