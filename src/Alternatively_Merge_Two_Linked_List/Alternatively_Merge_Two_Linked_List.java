package Alternatively_Merge_Two_Linked_List;

public class Alternatively_Merge_Two_Linked_List {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(3);
        n1.next = new ListNode(5);
        n1.next.next = new ListNode(7);
        n1.next.next.next = new ListNode(9);
        n1.next.next.next.next = new ListNode(11);

        ListNode n2 = new ListNode(2);
        n2.next = new ListNode(4);
        n2.next.next = new ListNode(6);
        n2.next.next.next = new ListNode(8);
        
        print(n1);
        print(n2);
        
        alternatingValueOfTwoLinkedList(n1, n2);

    }

    public static ListNode alternatingValueOfTwoLinkedList(ListNode n1, ListNode n2) {

        ListNode before_head = new ListNode(0);
        ListNode before = before_head;

        
        while (n1 != null && n2 != null) {
            
            before.next = n1;
            n1 = n1.next;
            before = before.next;
            
            before.next = n2;
            n2 = n2.next;
            before = before.next;

            
            
        }
        //before.next = null;
       
        
        if (n1 != null)
            before.next = n1;

        if (n2 != null)
            before.next = n2;
        
        print(before_head.next);
        
        

        return before_head.next;

    }

    public static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
