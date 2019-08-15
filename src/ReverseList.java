/**
 * 输入一个链表，反转链表后，输出新链表的表头
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        while(head != null){
            listNode1 = head.next;
            head.next = listNode2;
            listNode2 = head;
            head = listNode2;
        }
        return listNode1;
    }
}
