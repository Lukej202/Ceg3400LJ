//Luke Jennings

import java.util.Scanner;
import java.lang.Math;
public class Lab1 {
    public static void main(String[] args){
        double height = 1.33333;
        double pie = 3.14159;
        Scanner sc = new Scanner(System.in);
            //gets the users radius
            System.out.println("What is the radius of your circle?: ");
        double userRadius = sc.nextDouble();
        //finds the radius cubed
        double radiusCubed = Math.pow(userRadius, 3);
        //calculates the volume
        double circleRadius = (double) height * pie * radiusCubed;
        //outputs the volume
            System.out.printf("users volume is: %.2f " , circleRadius );


    }
}
