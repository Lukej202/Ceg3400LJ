//Luke Jennings
import java.util.Scanner;
import java.lang.Math;

public class Lab6{
    public static double getSphereVolume(double userRadius){
        double height = 1.33333;
        double pie = 3.14159;
        double radiusCubed = Math.pow(userRadius, 3);
        //calculates the volume
        double sphereVol = height * pie * radiusCubed;
            return sphereVol;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius of your circle?: ");
        double userRadius = sc.nextDouble();
        System.out.printf("The volume of your sphere is %.2f ", getSphereVolume(userRadius));
    }
}