public class PalindromeNumber9 {

    public boolean isPalindrome(int input) {
        if (input < 0) {
            return false;
        }
        int number = input;
        int inversion = 0;
        while (number > 9) {
            inversion = inversion * 10 + number % 10;
            number = number / 10;
        }
        inversion = inversion * 10 + number % 10;
        return inversion == input;
    }

}
