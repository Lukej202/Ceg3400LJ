package stuff;
import java.util.Scanner;
public class September7 {
    public static void main(String[]args){ 
        Scanner scnr = new Scanner(System.in);
            System.out.println("input a number between 0 and 15");
            int userInput = scnr.nextInt();
            if ((userInput <= 5) && (userInput < 11)){
                System.out.println("out of range");
            } 
            else{
                System.out.println("thats good");
            }
    }
}


