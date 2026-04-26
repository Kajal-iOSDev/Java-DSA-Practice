public class PalindromeCheck{

    // Logic to check if a number is a palindrome

    static boolean isPalindrome(int x){
        // Negative numbers are not palindromes
        if(x < 0){
            return false;
        }
        int original = x;
        int reverse = 0;
        while(x > 0){
            int rem = x % 10;
            reverse = (reverse * 10) + rem;
            x = x / 10;
        }
        // Compare the reversed number with the original
        return original == reverse;

    }
    public static void main(String[] args){
        int num = 121;
       // Calling the function and storing the boolean result
       boolean result = isPalindrome(num);
        System.out.println("The palindrome number is : "  + result);
    }
}
