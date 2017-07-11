public class AddBinary67 {
    public String addBinary(String binary1, String binary2) {
        int length = binary1.length() > binary2.length() ? binary1.length() : binary2.length();
        String result = "";
        int temp = 0;
        for (int i = 1; i <= length; i++) {
            if (binary1.length() - i >= 0) {
                temp += Integer.parseInt(binary1.charAt(binary1.length() - i) + "");
            }
            if (binary2.length() - i >= 0) {
                temp += Integer.parseInt(binary2.charAt(binary2.length() - i) + "");
            }
            result = temp % 2 + result;
            temp = temp / 2;
        }
        if(temp != 0) {
            result = temp + result;
        }
        return result;
    }
}
