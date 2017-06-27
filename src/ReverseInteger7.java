public class ReverseInteger7 {
    public int reverse(int input) {
        int reverse = 0;
        boolean isMinus = input < 0;
        try {
            if (isMinus) {
                input = Math.subtractExact(0, input);
            }
            while (input >= 10) {
                reverse = Math.addExact(Math.multiplyExact(reverse, 10), input % 10);
                input = input / 10;
            }
            reverse = Math.addExact(Math.multiplyExact(reverse, 10), input % 10);
            reverse = isMinus ? 0 - reverse : reverse;
            return reverse;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
