//Luke Jennings
import java.util.Scanner;
public class Lab4 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int howMany = 0;    
        System.out.println("Enter a series of numbers (enter 99999 to quit) ");
        int userNum = sc.nextInt();
            while(userNum != 99999){
                if(userNum > 0){
                    sum += userNum ;
                    howMany = howMany + 1;
                    
            }
            userNum = sc.nextInt();
        }
        double average = sum / howMany;
        System.out.println(average);
        
    }
}
