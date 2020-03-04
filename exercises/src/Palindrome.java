public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println("Is word palindrome? " + isPalindrome(word));
    }

    private static boolean isPalindrome(String word){
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}
