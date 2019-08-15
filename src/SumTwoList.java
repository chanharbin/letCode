import java.util.LinkedList;
import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumTwoList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new LinkedList();
        List<Integer> list2 = new LinkedList();
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        int list1Val = 0;
        int list2Val = 0;
        int bit = 1;
        for(int i = 0;i<list1.size();i++){
            list1Val += list1.get(i) * bit;
            bit *= 10;
        }
        bit = 1;
        for(int j = 0;j<list2.size();j++){
            list2Val += list2.get(j) * bit;
            bit *= 10;
        }
        int result = list1Val + list2Val;
        while(result != 0){
            ListNode listNode = new ListNode(result % 10);
            result /= 10;
            ListNode listNode1 = new ListNode(result % 10);
            listNode.next = listNode1;
        }
        return listNodeRe;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;

        ListNode l1Ne = new ListNode(1);
        ListNode l2Ne = new ListNode(1);
        ListNode l3Ne = new ListNode(1);
        l1Ne.next = l2Ne;
        l2Ne.next = l3Ne;
        ListNode listNode = addTwoNumbers(l1, l1Ne);

    }

}
