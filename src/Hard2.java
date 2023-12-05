//Third question Hard-2

//Algorithm
//
//        1. the characters of the input string are inserted one by one in reverse and incrementing
//        2. Checks if the substring from the beginning to the current character is a palindrome. If it is a palindrome, it adds the remaining characters (`extra') and exits the loop.
//        3. Returns the shortest palindrome by adding "more" characters to the beginning of the input string in reverse order, resulting in the shortest palindrome.
//

public class Hard2 {
    public static void main(String[] args) {
        String res = shortestPalindrome("ABCD");
        System.out.println(res);
    }

    // Function to find the shortest palindrome by adding characters to the beginning of the input string starting from end
    public static String shortestPalindrome(String word) {
        // repeating the characters of the input string backwards from the end
        for(int i=word.length()-1; i >= 0; i--){
            // Checking whether the substring from the beginning to the current character is a palindrome
            if(palindromeCheck(word, 0, i)){
                // If it is a palindrome, remove the remaining characters and add them to the beginning in reverse order
                String additional = word.substring(i+1);
                return new StringBuilder(additional).reverse().append(word).toString(); // returning the shortest palindrome by adding the additional letters in reverse
            }
        }
        // If the input string itself is a palindrome,  the original string is returned
        return new StringBuilder(word).reverse().append(word).toString();
    }

    // Function to check if a given substring is a palindrome
    static boolean palindromeCheck(String word, int left, int right){
//        System.out.println(word);
        // Move to the center and check if the symbols on the left and right are  the same
        while(left < right){
            if(word.charAt(left) != word.charAt(right))
                return false; // If characters do not match, word not a palindrome
            left++;
            right--;
        }
        return true; // If the loop completes, the substring is a palindrome
    }
}
