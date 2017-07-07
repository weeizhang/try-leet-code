public class CountAndSay38 {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            String temp = "";
            char number = result.charAt(0);
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) != number) {
                    temp += Integer.toString(count) + number;
                    number = result.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            temp += Integer.toString(count) + number;
            result = temp;
        }
        return result;
    }
}
