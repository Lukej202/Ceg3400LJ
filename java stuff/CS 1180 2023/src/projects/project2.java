//Luke Jennings
package projects;
import java.util.Scanner;
import java.util.Random;
public class project2 {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
    public static void sleep(){
        try {
            Thread.sleep(3000);
            } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
    }
    public static String color(){
        //creates random number generator
        Random rn = new Random();
        //creates a random number between 1 and 4
        int randNum = rn.nextInt(4);
        //depending on which number was generated the color will be returned
        if(randNum == 1){
            return "YELLOW";
        }else if(randNum == 2){
            return "GREEN";
        }else if(randNum == 3){
            return "RED";
        }else{
            return "BLUE";
        }
        
    }
    public static String num(){
        //creates a random num generator
        Random rn = new Random();
        //creates a random number between 1 and 9
        int randNum = rn.nextInt(9);
        //chacks to see which number was generated and returns that number as a string
        if(randNum == 1){
            return "1";
        }else if(randNum == 2){
            return "2";
        }else if(randNum == 3){
            return "3";
        }else if(randNum == 4){
            return "4";
        }else if(randNum == 5){
            return "5";
        }else if(randNum == 6){
            return "6";
        }else if(randNum == 7){
            return "7";
        }else if(randNum == 8){
            return "8";
        }else{
            return "9";
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //keeps the users score
        int score = 0;
        //loops the game until the user is done playing
        while(true){
        //asks the user which mode they want to play easy or hard
        System.out.println("lets play simon says select difficulty (easy or hard)");
        String mode = sc.nextLine();
        mode = mode.toUpperCase();
        //this if statement plays easy mode
        if(mode.equals("EASY")){
            System.out.println("easy - colors");
            String userInput = "";
            String answer = "";
            //this loop runs until userInput does not equal answer
            while(userInput.equals(answer)){
            //takes the color and adds it to answer
            answer += color();
            System.out.println("Simon Says: " + answer);
            //this makes the program pause for 3 seconds
            sleep();
            //this clears the screen
            clearScreen();
            userInput = sc.nextLine();
            userInput = userInput.toUpperCase();
            //this rgets rid of all spaces in the users answer so it does not matter if they type there answer with spaces or not 
            userInput = userInput.replaceAll("\\s", "");
            //checks to see if the users answer is correct and inrements c=score by 1 if 
            if(userInput.equals(answer)){
                score = score + 1;
                System.out.println("score: " + score);
                continue;
            }else{
                System.out.println("Round over your score was " + score);
                break;
            }
        }
            // this eles if plays hard mode
            }else if(mode.equals("HARD")){
            System.out.println("hard - numbers");
            String userInput = "";
            String answer = "";
            //loops until the players answer does not equal the answer
            while(userInput.equals(answer)){
                answer += num();
                //prints the answer with spaces inbetween all of the numbers
                System.out.println("Simon says: " + answer.replaceAll("", " ").trim());
                sleep();
                clearScreen();
                userInput = sc.nextLine();
                //this gets rid of all spaces in the users answer
                userInput = userInput.replaceAll("\\s","");
                //this checks if the users answer was correct and increments score by 1 if they were correct
                if(userInput.equals(answer)){
                    score = score + 1;
                    System.out.println("score: " + score);
                    continue;
                }else{
                    System.out.println("Round over your score was " + score);
                    break;
                }
            }
        // this else statement plays if the user enters anything excepth easy or hard
        }else{
            System.out.println("invalid difficulty");
        }
        //asks the user if they would like to play again
        System.out.println("Would you like to continue playing?");
        String playAgain = sc.nextLine();
        playAgain = playAgain.toUpperCase();
        //this loop runs until the user enters yes or no
        while(playAgain != "YES" || playAgain != "NO"){
            //if the user types yes the game replays
            if(playAgain.equals("YES")){
                break;
                //if the user types no the program exits
            }else if(playAgain.equals("NO")){
                //exits the program
                System.exit(0);
                }
            }
            //resets score if the user wants to play again
            score = 0;
        }
    }
}