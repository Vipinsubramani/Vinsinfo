public class ListToString {
    public static String convertToString(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToString(new char[]{'h', 'e', 'l', 'l', 'o'}));  // hello
        System.out.println(convertToString(new char[]{'p', 'y', 't', 'h', 'o', 'n'})); // python
        System.out.println(convertToString(new char[]{'a', 'b', 'c'})); // abc
    }
}
