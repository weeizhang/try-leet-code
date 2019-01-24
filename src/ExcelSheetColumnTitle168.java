public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        int temp = n;
        StringBuilder result = new StringBuilder();
        while (temp > 26) {
            if (temp % 26 == 0) {
                result.insert(0, 'Z');
                temp = (temp - 26) / 26;
            } else {
                result.insert(0, (char) ('A' + temp % 26 - 1));
                temp = temp / 26;
            }
        }
        result.insert(0, (char) ('A' + temp - 1));
        return result.toString();
    }
}
