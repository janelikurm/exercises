import java.util.Arrays;
import java.util.Scanner;

public class StandardInOut {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some string");
        String answer = scanner.nextLine();
        System.out.println("Press 1 if you would like to reverse words in the sentence, press 2 if you would like to reverse letters in words and press 3 if you would like to both");
        int choice = scanner.nextInt();
        userChoiceControl(scanner, answer, choice);
    }

    private static void userChoiceControl(Scanner scanner, String answer, int choice) {
        if (choice == 1) {
            System.out.println(reverseWords(answer));
        } else if (choice == 2) {
            System.out.println(reverseWordsCharacters(answer));
        } else if (choice == 3) {
            System.out.println(reverseWordsAndCharactersShort(answer));
        } else {
            System.out.println("Please provide correct number from 1 to 3");
            userChoiceControl(scanner, answer, scanner.nextInt());
        }
    }


    public static String reverseWords(String input) {
        String[] words = input.split("\s+");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                reverseString.append(words[i]);
            } else {
                reverseString.append(words[i]).append(" ");
            }
        }
        return reverseString.toString();
    }

    public static String reverseWordsCharacters(String input) {

        String[] split = reverseWords(input).split("\s+");
        StringBuilder reverseString = new StringBuilder();

        for (String word : split) {
            char[] wordToChar = word.toCharArray();
            char[] result = new char[word.length()];
            for (int i = wordToChar.length - 1; i >= 0; i--) {
                result[wordToChar.length - i - 1] = wordToChar[i];
            }
            reverseString.append(result).append(" ");
        }
        return reverseString.toString().trim();
    }

    public static String reverseWordsAndCharactersShort(String input) {
        StringBuilder sb = new StringBuilder(input.replaceAll("\\s+", " "));
        return sb.reverse().toString();
    }
}