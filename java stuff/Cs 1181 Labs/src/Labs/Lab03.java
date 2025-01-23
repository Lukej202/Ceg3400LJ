package Labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //initialises sideLength value
        int sideLength = 0;
        //controls when the while loop stops when a positive number is enterd as a side length
        boolean newNum = false;
        while(!newNum){
            System.out.println("What is the side length of the square?");
        try{
            //initialises sideLength to what the user enters
            sideLength = sc.nextInt();
            //makes the square object
            Square sq = new Square(sideLength);
            //prints the toString method from the Square class
            System.out.println(sq);
            //makes newNum true so the while loop stops
            newNum = true;
            //catches the custom exception if a negative side length is enterd
        }catch(negativeLengthException e){
            //prints the error message made for the custom exception
            System.out.println(e.getMessage());
            sc.nextLine();
            //catches a inputMismatchException
        }catch(InputMismatchException e){
            System.out.println("please type a number");
            sc.nextLine();
        }
    }
}
}
