import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;  // Store the original number
        int reversedNum = 0;    // Variable to store the reversed number
        int remainder;

        // Reverse the digits of the number
        while (num != 0) {
            remainder = num % 10;       // Get the last digit of the number
            reversedNum = reversedNum * 10 + remainder; // Build the reversed number
            num /= 10;                   // Remove the last digit from the number
        }

        // If the reversed number is equal to the original number, it's a palindrome
        return originalNum == reversedNum;
    }
}