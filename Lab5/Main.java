public class Main {
    public static void main(String[] args) {
        String text = "Заварилась какая-то бяКа на отдалённых рубежах о которой нет достоверной информации";

        // 1
        System.out.println("Самое длинное слово в тексте: " + Part.findLongestWord(text));

        // 2
        String word = "level";
        System.out.println(word + " является палиндромом? " + Part.isPalindrome(word));

        // 3
        String censoredText = Part.censorWord(text);
        System.out.println("Текст после цензуры: " + censoredText);

        // 4
        String str1 = "hello, hello, hello, world";
        String str2 = "hello";
        int occurrences = Part.countOccurrences(str1, str2);
        System.out.println("Количество вхождений строки \"" + str2 + "\" в \"" + str1 + "\": " + occurrences);

        // 5
        String inputString = "This is a test string";
        String invertedString = Part.invertWords(inputString);
        System.out.println("Результат инвертирования слов: " + invertedString);
    }
}
