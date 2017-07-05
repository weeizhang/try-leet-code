public class ImplementStr28 {
    public int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                index = i;
                break;
            }
        }
        return index;
    }
}
