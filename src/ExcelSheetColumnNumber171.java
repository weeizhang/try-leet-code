public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int result = s.charAt(s.length() - 1) - 'A' + 1;
        for (int i = s.length() - 2; i >= 0; i--) {
            result += (s.charAt(i) - 'A' + 1) * Math.pow(26, s.length() - i - 1);
        }
        return result;
    }
}
