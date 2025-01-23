package stuff;
import java.lang.Math;

public class introvars {
    public static void main(String[] args){
        //int
        int num1 = 7;  
        //double
        double bannana = 6.7;
        //string
        String myString = "My first string.";

        System.out.println(myString);
        System.out.println(num1);
        System.out.println("The number of bannana's are " + bannana);
        System.out.println(6 + 7);

        int num2 = 8;
        int num3 = 13;
        int answer = num2 + num3;
        System.out.print("The answer is " + answer);

        int minimum = Math.min(num2, num3);

        System.out.println("The minimum value is " + minimum);
    }
}
