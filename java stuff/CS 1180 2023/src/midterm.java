import java.util.Scanner;
public class midterm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        int positiveLoop = 0;
        int negativeLoop = 0;
        int positivsSum = 0;
        int negativeSum = 0;
        while(userInput != -1){
            System.out.println("Enter an integer (-1 to quit )");
            userInput = sc.nextInt();
            if(userInput >= 0 && userInput != 42){
                positivsSum += userInput;
                positiveLoop += 1;
            }else if(userInput == 42 || userInput == -42 || userInput == -1){
                continue;
            }else{
                negativeSum += userInput;
                negativeLoop += 1;
            }
        }
        double positiveAverage = positivsSum/positiveLoop;
        double negativeAverage = negativeSum/negativeLoop;
        System.out.println("The sum of the positive numbers is " + positivsSum);
        System.out.println("The sum of the negative numbers is " + negativeSum);
        System.out.println("The average of the positive numbers is " + positiveAverage);
        System.out.println("The average for the negative numbers is " + negativeAverage);
    }
}
