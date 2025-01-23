package Labs;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double fine;
        System.out.println("How many days late is your book?");
        int days = sc.nextInt();
        System.out.println("Are you a library VIP?");
        String VIP = sc.next();
        if((days <= 5)){
            if(VIP.charAt(0) == 'Y'){
                fine = 0.25;
                System.out.print("Your fine is $");
                System.out.printf("%.2f", + fine);
                System.out.println(" for being " + days + " days late");
            }else{
                fine = 0.50;
                System.out.print("Your fine is $");
                System.out.printf("%.2f", + fine);
                System.out.println(" for being " + days + " days late");
            }
        }else if((days > 5) && (days < 11)){
            if(VIP.charAt(0) == 'Y'){
                fine = 2.50;
                System.out.print("Your fine is $");
                System.out.printf("%.2f", + fine);
                System.out.println(" for being " + days + " days late");
            }else{
                fine = 5.00;
                System.out.print("Your fine is $");
                System.out.printf("%.2f", + fine);
                System.out.println(" for being " + days + " days late");
            }
        }else if(days > 10){
            if(VIP.charAt(0) == 'Y'){
                fine = 5.00;
                System.out.print("Your fine is $");
                System.out.printf("%.2f", + fine);
                System.out.println(" for being " + days + " days late");
            }else{
                fine = 10.00;
                System.out.print("Your fine is $");
                System.out.printf("%.2f", + fine);
                System.out.println(" for being " + days + " days late");
            }
        }
    }
}
