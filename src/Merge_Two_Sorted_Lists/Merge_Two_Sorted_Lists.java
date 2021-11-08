package Merge_Two_Sorted_Lists;

public class Merge_Two_Sorted_Lists {

    ListNode head;
    int size;

    public static void main(String[] args) {

        ListNode n1 = new ListNode(3);
        n1.next = new ListNode(5);
        n1.next.next = new ListNode(7);
        n1.next.next.next = new ListNode(9);
        n1.next.next.next.next = new ListNode(11);
        show(n1);

        ListNode n2 = new ListNode(2);
        n2.next = new ListNode(4);
        n2.next.next = new ListNode(6);
        n2.next.next.next = new ListNode(8);
        n2.next.next.next.next = new ListNode(10);
        show(n2);

        ListNode result = mergeTwoLists_Iteration(n1, n2);
        show(result);

    }

    public static ListNode mergeTwoLists_Iteration(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null)
            return null;

        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        ListNode sorting = null;
        ListNode result_node = null;

        if (l2.val > l1.val) {
            sorting = l1;
            l1 = sorting.next;
        } else {
            sorting = l2;
            l2 = sorting.next;
        }

        result_node = sorting;
        while (l1 != null && l2 != null) {
            if (l2.val > l1.val) {
                sorting.next = l1;
                sorting = l1;
                l1 = sorting.next;
            } else {
                sorting.next = l2;
                sorting = l2;
                l2 = sorting.next;
            }
        }

        if (l1 == null)
            sorting.next = l2;
        if (l2 == null)
            sorting.next = l1;

        return result_node;
    }

    public int getSize() {
        return size;
    }

    public static void show(ListNode result) {

        if (result == null)
            return;

        System.out.print(result.val + " -> ");

        while (result.next != null) {
            result = result.next;
            System.out.print(result.val + " -> ");
        }

        System.out.println();
    }

}
