import java.util.ArrayList;

public class PrintReverseLink {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        if (listNode != null) {
            ArrayList<Integer> arrayList = new ArrayList();
            while (listNode.next != null) {
                arrayList.add(listNode.val);
            }
            for (int i = arrayList.size(); i >= 0; i++) {
                arrayList1.add(arrayList.get(i));
            }
        }
        return arrayList1;

    }

}
