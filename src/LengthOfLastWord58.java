public class LengthOfLastWord58 {
    public int lengthOfLastWord(String str) {
        String[] strings = str.split(" ");
        return strings.length == 0 ? 0 : strings[strings.length - 1].length();
    }
}
