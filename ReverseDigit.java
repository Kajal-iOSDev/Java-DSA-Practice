*
 Reverse the number.
 If it goes out of int range, return 0.
*/

public class ReverseDigit{

    static int reverse(int x) {
        int reverse = 0; // result store

        while (x != 0) {
            int rem = x % 10; // get last digit

            // check overflow before multiplying
            if (reverse > Integer.MAX_VALUE / 10 || 
                reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + rem; // add digit to result
            x = x / 10; // remove last digit
        }

        return reverse; // final answer
    }

    public static void main(String[] args) {
        int n = 321;
        int result = reverse(n);
        System.out.println("Reverse number is: " + result);
    }
