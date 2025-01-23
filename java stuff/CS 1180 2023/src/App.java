import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        doLoopForInput();
        doLoopAddToString();

    }

    /**
     * In lab demo for reading input in a loop
     * 
     * @param N/A
     * @return void
     */
    public static void doLoopForInput() {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Who is your prof.");

        String input = scnr.nextLine();

        while (!input.equals("Duncan") && !input.equals("Buck")) {
            System.out.println("This is not a prof. name");
            input = scnr.nextLine();
        }

        System.out.println(input + " is a valid prof. name");

    }

    public static void doLoopAddToString() {
        Scanner scnr = new Scanner(System.in);

        String userInput = "";

        String correctAnswer = "";

        while (userInput.equals(correctAnswer)) {
            correctAnswer += getNewBit();
            System.out.println("New Sequence: " + correctAnswer);

            userInput = scnr.nextLine();
        }

        System.out.println("Wrong Answer");
    }

    public static String getNewBit() {
        if (Math.random() > 0.5) {
            return "0";
        } else {
            return "1";
        }
    }
}
