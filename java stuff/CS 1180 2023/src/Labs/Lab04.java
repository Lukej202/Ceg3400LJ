package Labs;
import java.util.Scanner;
public class Lab04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int userNum = 0;
        int counter = 0;
        while(userNum <= 100){
            System.out.println("enter a number: ");
            int  num = sc.nextInt();
            userNum = userNum + num; 
            counter ++;
        }
        System.out.println("you entered " + counter + " values before the total was greater than 100.");
    }
}
