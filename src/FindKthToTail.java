/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode res = head;
        int i = 0;
        while(head.next != null){
            i++;
            if(i == k){
                res = res.next;
            }
        }
        return res;
    }
}
