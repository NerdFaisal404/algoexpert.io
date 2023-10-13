package easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;

        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return (x == reverse) || (x == reverse / 10);
    }
}
