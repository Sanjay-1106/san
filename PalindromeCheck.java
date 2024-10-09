public class PalindromeCheck {
    public static void main(String[] args) {
        // Predefined string
        String text = "radar";

        // Convert to lowercase to ensure case insensitivity
        text = text.toLowerCase();

        // Reverse the string
        String reversedText = new StringBuilder(text).reverse().toString();

        // Check if the original string is the same as the reversed string
        if (text.equals(reversedText)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
