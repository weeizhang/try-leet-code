import java.util.Arrays;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int above = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                result[i + 1] = (digits[i] + 1) % 10;
                above = (digits[i] + 1) / 10;
            } else {
                if (above != 0) {
                    result[i + 1] = (digits[i] + 1) % 10;
                    above = (digits[i] + 1) / 10;
                } else {
                    result[i + 1] = digits[i] % 10;
                    above = digits[i] / 10;
                }
            }
        }
        if (above == 1) {
            result[0] = 1;
        }
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }
}