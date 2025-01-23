package Labs;
import java.util.Scanner;
public class Lab06 {
    /**
     * Checks to see if num is between 0 and 50
     * @param num
     * @return returns a boolean true if num is between 0 and 50 false if not
     */
    public static boolean verifyNum(int num){
        if(num >= 1 && num <= 50){
            return true;
        }else{
            return false;
        }
    }
    /**
     * prints a multiplacation table with the top limit being thae value of num
     * @param num
     * @return returns void
     */
    public static void printTable(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the value for n? ");
        int userNum = sc.nextInt();
        if(verifyNum(userNum) == true){
            printTable(userNum);
        }else{
            System.out.println("ERROR num must be between 0 and 50");
        }
    }
}
