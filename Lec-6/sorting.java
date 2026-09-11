class Solution {
    public ListNode sortList(ListNode head) {
        // Agar list empty hai ya sirf ek node hai
        if (head == null || head.next == null) {
            return head;
        }
        // List ko do parts mein todne ke liye
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //Doosri list ka starting point
        ListNode dusraPart = slow.next;
        // Pehli list ko yahin tod diya
        slow.next = null;
        //Dono parts ko sort karo
        ListNode pehlaPart = sortList(head);
        dusraPart = sortList(dusraPart);
        //Dono sorted lists ko merge karo
        return mergeKaro(pehlaPart, dusraPart);
    }

    // Do sorted linked lists ko merge karega
    public ListNode mergeKaro(ListNode pehla, ListNode dusra) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (pehla != null && dusra != null) {
            if (pehla.val <= dusra.val) {
                current.next = pehla;
                pehla = pehla.next;
            } 
            else {
                current.next = dusra;
                dusra = dusra.next;
            }
            current = current.next;
        }
        // Jo list bach gayi usko attach kar do
        if (pehla != null) {
            current.next = pehla;
        } 
        else {
            current.next = dusra;
        }
        return dummy.next;
    }
}