package homework;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
 * to the original number. For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable, say reverse. Compare the number
 * with the reverse.
 * If both are the same then the number is a palindrome otherwise it is not
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        isPalindrome(454);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0, lastDigit;
        int temp;
        boolean b;

        temp=number;
        while(number!= 0 ) {
            lastDigit = number % 10;  //getting remainder
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if(temp==reverse)
        {
            b=true;
            System.out.println(b + " palindrome number ");
        return true;}
        else{
            b=false;
            System.out.println(b+ " not palindrome number");
        return b;}
    }
    }


