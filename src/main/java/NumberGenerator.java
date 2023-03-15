import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {

    public static void main(String[] args) {
        //Task 2:
//    Generate a random number 1 to 100,
//    ask the user to guess the number
//    and print if inserted number is higher,
//    lower or equal to the number.
//
//    Ask the question until user has entered "exit"
//
//    Hint: Math.random()

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(1, 101);
        System.out.println("Hello! I've generated a random number between 1 and 100. Please guess what?");
        String input = scanner.nextLine();
        inputControl(scanner, secretNumber, input);
        System.out.println("You have finished the game. Bye!");

    }

    private static void inputControl(Scanner scanner, int secretNumber, String input) {
        while (!input.equals("exit")) {
//            input.matches("\\d+");
            try {
                int userGuess = Integer.parseInt(input);
                if (userGuess <= 0 || userGuess > 100) {
                    System.out.println("The number must be between 1 and 100");
                } else if (secretNumber == userGuess) {
                    System.out.println("Wow! You are a genius!" + " " + secretNumber + " is correct answer!");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("The number is bigger than you guessed. Please try again!");
                } else {
                    System.out.println("The number is smaller than you guessed. Please try again!");
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("If you would like to continue the game please provide number between 1 to 100. If you would like to finish the game, please write 'exit'.");
            }
            input = scanner.next();
        }
    }
}

