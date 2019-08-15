import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class ReOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for(int i =0;i<array.length;i++){
            if(array[i]%2 == 0){
                arrayList2.add(array[i]);
            }
            else
                arrayList1.add(array[i]);
        }
        arrayList1.addAll(arrayList2);
        for(int i =0;i<array.length;i++){
            array[i] = arrayList1.get(i);
        }
    }
}
