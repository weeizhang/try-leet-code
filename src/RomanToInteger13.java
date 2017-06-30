import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

    public int romanToInt(String str) {
        Map<String, Integer> romans = new HashMap<>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);

        str = str.replace("\"", "");
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            Integer currentNumber = romans.get(str.substring(i, i + 1));
            Integer lastNumber = romans.get(str.substring(i + 1, i + 2));
            result = currentNumber >= lastNumber ? result + currentNumber : result - currentNumber;
        }
        result += romans.get(str.substring(str.length() - 1));
        return result;
    }

}
