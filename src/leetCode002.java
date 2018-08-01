import java.util.List;

public class leetCode002 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return solution(l1, l2, 0);
    }

    static ListNode solution(ListNode l1, ListNode l2, int carry) {
        ListNode list = new ListNode((l1.val + l2.val + carry) % 10);
        int val = l1.val + l2.val + carry;
        if (l1.next != null && l2.next != null) {
            list.next = solution(l1.next, l2.next, val / 10);
        } else if (l1.next != null) {
            list.next = carry(l1.next, val / 10);
        } else if (l2.next != null) {
            list.next = carry(l2.next, val / 10);
        } else if (val >= 10) {
            list.next = new ListNode(1);
        }
        return list;
    }

    static ListNode carry(ListNode l, int c) {
        if (l == null) return new ListNode(c);
        if (l.val + c >= 10) {
            l.next = carry(l.next, (l.val + c) / 10);
        }
        l.val = (l.val + c) % 10;
        return l;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
        ListNode r = addTwoNumbers(l1, l2);
        System.out.println(r.val + " " + r.next.val + " " + r.next.next.val + " " + r.next.next.next.val + " " + r.next.next.next.next.val);
    }
}
