// Part.java
public class Part {
    // 1
    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // 2
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 3
    public static String censorWord(String text) {
        return text.replaceAll("(?i)бяка", "[вырезано цензурой]");
    }

    // 4
    public static int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    // 5
    public static String invertWords(String inputString) {
        String[] words = inputString.split("\\s+");
        StringBuilder inverted = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            inverted.append(reverseWord(words[i])).append(" ");
        }
        return inverted.toString().trim();
    }

    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
