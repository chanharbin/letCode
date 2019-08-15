public class ReplaceSpace {
    public static void main(String[] args) {
    }

    private static String replaceSpace(StringBuffer str) {
        String string = str.toString();
        String s = string.replaceAll(" ", "%20");
        return s;
    }
}
