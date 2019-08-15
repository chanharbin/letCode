/**
 * 二维数组的查找整数
 */
public class FindArray {
    public static void main(String[] args) {
        int[][] array = {{}};
        System.out.println(Find(100, array));
    }

    public static boolean Find(int target, int[][] array) {
        int rowSize = array.length;
        if(rowSize == 0){
            return false;
        }
        int colSize = array[0].length;
        if(colSize == 0){
            return false;
        }
        for (int i = 0; i < rowSize; ) {
            if (target > array[i][colSize - 1]) {
                i++;
            }
            else if(target <= array[i][colSize - 1]){
                for (int j = colSize - 1; j >= 0; j--) {
                    if (target >= array[i][j]) {
                        for(int m = i;m<colSize;m++){
                            if(target == array[m][j]){
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
}
