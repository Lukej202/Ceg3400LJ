// Luke Jennings

package Labs;
import java.util.Scanner;
public class Lab02 {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("when were you born ( put it in the form 1 January 2001)");
        int day = scnr.nextInt();
        String month = scnr.next();
        int year = scnr.nextInt();
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("year: " + year);
    }
}
