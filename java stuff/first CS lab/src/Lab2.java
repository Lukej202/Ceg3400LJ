//Luke Jennings

import java.util.Scanner;
public class Lab2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            //Prompts the user for their Birthday
            System.out.println("When were you born? (use the format 1 January 1970)");
            int day = sc.nextInt();
            String month = sc.next();
            int year = sc.nextInt();
            //prints the Day of the users birthday
            System.out.println("The day is: " + day) ;
            //Prints the month of the users Birthday
            System.out.println("The month is: " + month );
            //prints the year of the users birthday
            System.out.println("The year is: " + year);
    
//https://www.w3schools.com/java/java_usere_input.asp
        }
    
}
