public class AlphabetStats {
    public static void main(String[] args) {
        String word = "madam";
        String sentence = "hello, I am looking for the longest word";
        System.out.println("Total vowel count: " + vowelCounter(word));
        System.out.println("Longest word: " + longestWord(sentence));
    }
    
    private static int vowelCounter(String text){
        String vowels = "aeiou";
        int totalVowel = 0;
        String[] letters = text.split("");
        for (int i = 0; i < text.length(); i++) {
            if (vowels.contains(letters[i]))
                totalVowel += 1;
        }
        return totalVowel;
    }

    private static String longestWord(String sentence){
        String[] words = sentence.split(" ");
        String longestWord = words[0];

        for ( String word : words ){
            if ( word.length() > longestWord.length() )
                longestWord = word;
        }
        return longestWord;
    }
}