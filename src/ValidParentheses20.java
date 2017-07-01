import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String str) {
        str = str.replace("\"", "");
        Stack stack = new Stack();
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.empty() || (!stack.empty() && !(parentheses.get(c) == stack.pop()))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
