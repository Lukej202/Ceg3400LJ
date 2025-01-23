//Luke Jennings
import java.util.Scanner;
public class Lab3 {
    public static void main(String[]args){
        Scanner sc1 = new Scanner(System.in);
        //promts the user for their loan amount
            System.out.println("What is your loan amount? ");
        int loanAmount = sc1.nextInt();
        //prompts the user for their down payment
            System.out.println("what is your down payment");
        int downPayment = sc1.nextInt();
        //asks the user if they have held a job for at least a year
            System.out.println("Have you held your current job for at least a year? ");
        String jobTime = sc1.next().toLowerCase();
        //asks the user for their annual salary
            System.out.println("What is your annual salary? ");
        int annualSal = sc1.nextInt();

        if (downPayment >= 0.2 * loanAmount || jobTime.charAt(0) == 'y' && annualSal <= 0.5 * loanAmount){    
            System.out.println("you qualify for this loan");
        }else{
            System.out.println("You are not eligible for this loan ");
        }

    }
}
