public class ValidPalindrome125 {
    public boolean isPalindrome(String str) {
        String formatedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = formatedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (formatedStr.charAt(i) != formatedStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
